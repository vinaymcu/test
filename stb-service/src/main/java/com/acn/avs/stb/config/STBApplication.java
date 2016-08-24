/***************************************************************************
 * Copyright (C) Accenture
 * 
 * The reproduction, transmission or use of this document or its contents is not permitted without
 * prior express written consent of Accenture. Offenders will be liable for damages. All rights,
 * including but not limited to rights created by patent grant or registration of a utility model or
 * design, are reserved.
 * 
 * Accenture reserves the right to modify technical specifications and features.
 * 
 * Technical specifications and features are binding only insofar as they are specifically and
 * expressly agreed upon in a written contract.
 * 
 **************************************************************************/
package com.acn.avs.stb.config;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.acn.avs.common.validation.EnableValidation;

@EnableValidation
@Configuration
@EnableCaching
@EnableAutoConfiguration(exclude = { RabbitAutoConfiguration.class })
@EnableTransactionManagement
@EntityScan(basePackages = { "com.acn.avs.common.entity.common", "com.acn.avs.common.entity.stb",
		"com.acn.avs.common.entity.group" })
@SpringBootApplication(scanBasePackages = { "com.acn.avs.stb" })
@EnableJpaRepositories(basePackages = { "com.acn.avs.stb.repository" })
@ComponentScan(basePackages = { "com.acn.avs.stb", "com.acn.avs.common.web" })
public class STBApplication extends SpringBootServletInitializer {

	private static final Logger LOGGER = Logger.getLogger(STBApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(STBApplication.class, args);
	}

	@PostConstruct
	public void init() {
		LOGGER.info("Initializing STBApplication  .. ");
	}
}
