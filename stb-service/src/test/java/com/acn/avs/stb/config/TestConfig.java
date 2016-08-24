package com.acn.avs.stb.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EntityScan(basePackages = { "com.acn.avs.common.entity" })
@SpringBootApplication
@EnableJpaRepositories("com.acn.avs.stb.repository")
@ComponentScan(basePackages={"com.acn.avs.stb.service,com.acn.avs.stb.repository,com.acn.avs.stb.helper"})
@Profile(value = { "test" })
public class TestConfig {
	public static void main(String[] args) {
		SpringApplication.run(TestConfig.class, args);
	}
}
