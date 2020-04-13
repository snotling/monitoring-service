package org.snot.springboottemplate;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SpringBootTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTemplateApplication.class, args);
	}

}
