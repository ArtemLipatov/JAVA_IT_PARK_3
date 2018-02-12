package com.company.services;

import com.company.models.FileInfo;
import com.company.repositories.FilesInfoRepository;
import com.company.repositories.UsersRepository;
import lombok.SneakyThrows;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;


@Service
public class FilesServiceImpl implements FilesService {

    @Autowired
    private FilesInfoRepository filesInfoRepository;

    @Autowired
    private UsersRepository usersRepository;


    @Value(value = "${storage.path}")
    private String storagePath;

    @Override
    @SneakyThrows
    public String save(Authentication authentication, MultipartFile multipartFile) {
        FileInfo fileInfo = FileInfo.builder()
                .originalName(multipartFile.getOriginalFilename())
                .size(multipartFile.getSize())
                .owner(usersRepository.findByEmail(authentication.getName()).get())
                .type(multipartFile.getContentType())
                .build();

        String newName = UUID.randomUUID().toString().replace("-", "");
        String extension = multipartFile.getOriginalFilename()
                .substring(multipartFile.getOriginalFilename().lastIndexOf("."),
                        multipartFile.getOriginalFilename().length());
        fileInfo.setStorageName(newName + extension);
        fileInfo.setUrl(storagePath + "\\" + fileInfo.getStorageName());

        Files.copy(multipartFile.getInputStream(), Paths.get(storagePath, fileInfo.getStorageName()));
        filesInfoRepository.save(fileInfo);
        return fileInfo.getStorageName();

    }

    @Override
    @SneakyThrows
    public void writeFileToResponse(String fileName, HttpServletResponse response) {
        FileInfo fileInfo = filesInfoRepository.findOneByStorageName(fileName);
        response.setContentType(fileInfo.getType());
        InputStream inputStream = new FileInputStream(new File(fileInfo.getUrl()));
        IOUtils.copy(inputStream, response.getOutputStream());
        response.flushBuffer();


    }
}
