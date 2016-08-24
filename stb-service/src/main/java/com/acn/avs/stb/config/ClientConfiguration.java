package com.acn.avs.stb.config;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile(value = { "DEV", "CLOUD" })
@EnableFeignClients(basePackages = { "com.acn.avs.stb.client" })
@ComponentScan(basePackages = { "com.acn.avs.common.client.avsmediator" })
public class ClientConfiguration {

	private static final Logger LOGGER = Logger.getLogger(STBApplication.class);

	@PostConstruct
	public void init() {
		LOGGER.info("Initializing ClientConfiguration  .. ");

	}
}
