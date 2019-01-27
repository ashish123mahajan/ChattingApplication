/*package dac.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import dac.pojo.UploadFileResponse;
import dac.services.FileStorageService;

public class FileUploadController {
	@Autowired
	private FileStorageService fileStorageService;

	// use in html
	// <input id="singleFileUploadInput" type="file" name="file"/>

	@PostMapping("/uploadFile")
	public UploadFileResponse uploadFile(@RequestParam("file") MultipartFile file) {
		String fileName = fileStorageService.storeFile(file);

		String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/downloadFile/")
				.path(fileName).toUriString();

		return new UploadFileResponse(fileName, fileDownloadUri, file.getContentType(), file.getSize());
	}

	@PostMapping("/uploadMultipleFiles")
	public ArrayList<UploadFileResponse> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
		return (ArrayList<UploadFileResponse>) Arrays.asList(files).stream().map(file -> uploadFile(file))
				.collect(Collectors.toList());
	}

}
*/