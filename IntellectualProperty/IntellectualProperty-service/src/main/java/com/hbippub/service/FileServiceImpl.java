/**
 * 
 */
package com.hbippub.service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.hbippub.commons.Constant;
import com.hbippub.commons.FtpUtil;

/**
 * @author 梁lab 806
 *
 */
@Service
public class FileServiceImpl implements FileService {


	

	/* (non-Javadoc)
	 * @see com.hbippub.service.FileService#generateFileName()
	 */
	@Override
	public String generateFileName() {
		return UUID.randomUUID().toString();
	}

	/* (non-Javadoc)
	 * @see com.hbippub.service.FileService#uploadFile(org.springframework.web.multipart.MultipartFile)
	 */
	@Override
	public String uploadFile(MultipartFile multipartFile) throws IOException {
		return saveFile(multipartFile);
	}

	/* (non-Javadoc)
	 * @see com.hbippub.service.FileService#saveFile(org.springframework.web.multipart.MultipartFile)
	 */
	@Override
	public String saveFile(MultipartFile multipartFile){
		try {
			if (!multipartFile.isEmpty()) {
				String filename = generateFileName()+multipartFile.getOriginalFilename();
				String filePath = "/" + new SimpleDateFormat("yyyy").format(new Date()) + "/"
						+ new SimpleDateFormat("MM").format(new Date()) + "/"
						+ new SimpleDateFormat("dd").format(new Date());

				FtpUtil.uploadFile(Constant.FTP_ADDRESS, Constant.FTP_PORT, Constant.FTP_USERNAME, Constant.FTP_PASSWORD, Constant.FTP_BASE_PATH, filePath, filename, multipartFile.getInputStream());
				return filePath+filename;
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
