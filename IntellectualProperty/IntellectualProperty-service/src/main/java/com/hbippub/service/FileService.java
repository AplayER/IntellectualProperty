/**
 * 
 */
package com.hbippub.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;


/**
 * @author 梁lab 806
 *
 */
public interface FileService {
	public String generateFileName(); 
	public String uploadFile(MultipartFile multipartFile) throws IOException;
	public String saveFile(MultipartFile multipartFile);

}
