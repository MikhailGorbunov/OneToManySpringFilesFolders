package com.Files_and_Folders.Files_and_Folders;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test") //Indicates it's a test profile so will not run DataLoader
@SpringBootTest
class FilesAndFoldersApplicationTests {

    @Test
    void contextLoads() {
    }

}