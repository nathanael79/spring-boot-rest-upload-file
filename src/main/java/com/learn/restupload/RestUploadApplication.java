package com.learn.restupload;

import com.learn.restupload.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties({
		FileStorageProperties.class
})
@SpringBootApplication
public class RestUploadApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestUploadApplication.class, args);
	}

}
