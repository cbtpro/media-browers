package com.chenbitao.mediabrowers.web.controller;

import java.util.List;
import java.util.concurrent.Callable;

import com.chenbitao.mediabrowers.models.IFile;
import com.chenbitao.mediabrowers.services.FileService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Wellcome {

	@Autowired
	private FileService fileService;

	@GetMapping
	public Callable<List<IFile>> wellcome() {
		Callable<List<IFile>> callable = new Callable<List<IFile>>() {
			@Override
			public List<IFile> call() throws  Exception {
				return fileService.getDirs();
			}
		};
		return  callable;
	}
}
