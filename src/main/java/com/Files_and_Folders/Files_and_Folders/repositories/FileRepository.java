package com.Files_and_Folders.Files_and_Folders.repositories;


import com.Files_and_Folders.Files_and_Folders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
