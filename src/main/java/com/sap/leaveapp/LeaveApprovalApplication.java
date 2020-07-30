package com.sap.leaveapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sap.icd.odatav2.spring.SpringODataLibraryPackageMarker;

@SpringBootApplication
@ComponentScan(basePackageClasses = {LeaveAppPackageMarker.class, SpringODataLibraryPackageMarker.class}, basePackages = {"com.sap.leaveapp", "com.sap.icd.odatav2"})
@EntityScan("com.sap.leaveapp.model")
@EnableJpaRepositories("com.sap.leaveapp.repository")
public class LeaveApprovalApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeaveApprovalApplication.class, args);
	}

}
