/**
 * 
 */
package com.hbippub.controller;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.hbippub.service.FileService;

/**
 * @author 梁lab 806
 *
 */
@Controller
public class FileController {
	@Autowired
	private FileService fileService;
	/*
	 * 测试文件上传的功能
	 */
	@RequestMapping("/file")
	public String upload(){
		return "file";
	}
//	@RequestMapping("/file/upload")
//	public String doUpload(@RequestParam("file") MultipartFile file) throws IOException{
//		if (!file.isEmpty()) {
//			FileUtils.copyInputStreamToFile(file.getInputStream(), new File("c:\\test\\",System.currentTimeMillis()+file.getOriginalFilename()));
//		}
//		return "success";
//	}
	@RequestMapping("/file/upload")
	public String doUpload(@RequestParam("file") MultipartFile file,Model model) throws IOException{
		
		if (file.isEmpty()) {
			return "fail";
		}
		else {
			String res = fileService.uploadFile(file);
			if (res!=null) {
				model.addAttribute("path", res);
				return "success";
			}
			else {
				return "fail";
			}
		}

	}
	

}
