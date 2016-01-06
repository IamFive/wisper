package com.woo.wisper.service;

import java.io.*;
import java.text.*;

import org.apache.commons.lang3.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.multipart.*;

import edu.hunter.modules.common.util.*;

@Service
@Lazy(value = false)
public class UploadService {

	@Autowired
	@Value("${pro.upload.base}")
	private String uploadBase;

	public String upload(MultipartFile file, String... folderName) throws IllegalStateException, IOException {

		if (!file.isEmpty()) {
			String originalFilename = file.getOriginalFilename();
			String name = getRandomName(originalFilename);
			String folder = StringUtils.join(folderName, File.separator);
			String path = uploadBase + File.separator + folder + File.separator;
			String newFileName = path + File.separator + name;
			FileHelper.mkdirs(newFileName);
			file.transferTo(new File(newFileName));
			return MessageFormat.format("/{0}/{1}", StringUtils.join(folderName, "/"), name);
		}

		return null;
	}

	public String getAbsPath(String folder) throws IOException {
		String path = uploadBase + File.separator + folder + File.separator;
		FileHelper.mkdirs(path);
		return path;
	}

	private static String getRandomName(String originalFilename) {
		String suffix = StringUtils.substringAfterLast(originalFilename, ".");
		String random = RandomStringUtils.randomAlphanumeric(10);
		return MessageFormat.format("{0}.{1}", random, suffix);
	}

}
