package com.javaexpress.docker.dockerspringboothello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dev")
public class DockerHelloWorld {

	@GetMapping("ops")
	public String getName() {
		
		return "This is the deployment process of CICD in to AWS EC2 instance using jenkins, docker and git";
	}
}
