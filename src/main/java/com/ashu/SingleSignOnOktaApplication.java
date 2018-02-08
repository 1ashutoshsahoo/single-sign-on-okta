package com.ashu;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class SingleSignOnOktaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingleSignOnOktaApplication.class, args);
	}

	@GetMapping("/")
	public String echoTheUsersEmailAddress(Principal principal) {
		return "Hey there! Your email address is: " + principal.getName();
	}
}
