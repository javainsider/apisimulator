package com.javainsider.apisimulator.apiserver;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@RequestMapping("/api/hello")
	public String welcome() {
		return "Welcome to API Server app!!!";
	}

}
