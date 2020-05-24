package com.chenbitao.mediabrowers.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Directory extends File {
    @Getter
    @Setter
    private List<IFile> subs;
    public Directory(String name, String type, long size, String updateTime, String createTime, List<IFile> subs) {
        super(name, type, size, updateTime, createTime);
        this.subs = subs;
    }
    
}