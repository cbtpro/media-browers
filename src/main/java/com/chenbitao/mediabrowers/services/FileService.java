package com.chenbitao.mediabrowers.services;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.chenbitao.mediabrowers.models.Directory;
import com.chenbitao.mediabrowers.models.IFile;
import com.chenbitao.mediabrowers.models.MediaFile;
import com.chenbitao.mediabrowers.properties.AppProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("fileService")
public class FileService {
    
	@Autowired
    private AppProperties appProperties;

    public List<IFile> getDirs() {
        return  this.listDir(appProperties.getPath());
    }

    private List<IFile> listDir(String path) {
        List<IFile> list = new ArrayList<>();
        File file = new File(path);
        if (file.exists()) {
            File[] subFiles = file.listFiles();
            if (subFiles == null  || subFiles.length == 0) {
                return null;
            } else {
                for (File subFile : subFiles) {
                    if (subFile.isDirectory()) {
                        Directory dir = new Directory(subFile.getName(), "文件夹", subFile.getTotalSpace(),  "", "",  listDir(subFile.getAbsolutePath()));
                        list.add(dir);
                    } else {
                        list.add(MediaFile.builder().name(subFile.getName()).build());
                    }
                }
            }
        } else {
            return null;
        }
        return list;
    }
}