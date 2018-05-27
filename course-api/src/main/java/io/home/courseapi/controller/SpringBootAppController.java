package io.home.courseapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootAppController {

	@RequestMapping("/hi")
	public String sayHi() {
		return "Hi";
	}
}
