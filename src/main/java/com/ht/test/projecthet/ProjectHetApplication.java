package com.ht.test.projecthet;

import com.ht.test.projecthet.service.impl.TestServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:hetong.xml")
public class ProjectHetApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProjectHetApplication.class, args);
    }
}
