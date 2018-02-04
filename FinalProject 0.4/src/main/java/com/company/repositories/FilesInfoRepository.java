package com.company.repositories;


import com.company.models.FileInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilesInfoRepository extends JpaRepository<FileInfo, Long> {
    FileInfo findOneByStorageName(String fileName);
}
