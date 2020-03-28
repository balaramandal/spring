package com.rxp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/fileUpload")
public class FileUploadController {
	@RequestMapping("/upload")
	public void uploadFile(@RequestParam(name = "file")MultipartFile file) {
		System.out.println("recived");
	}
}
