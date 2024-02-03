package com.flatrent.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDatasourceConfiguration {
	@Value("${spring.datasource.url}")
	private String databaseUrl;
	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;
	
	@Bean
	public DataSource dataSource() {
		return DataSourceBuilder
				.create()
				.url(databaseUrl)
				.username(username)
				.password(password)
				.build();
	}

}
