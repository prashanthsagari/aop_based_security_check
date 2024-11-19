package com.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.custom.security.annotations.AdminAccess;




@RestController
public class SampleController {

	@AdminAccess
	@GetMapping("/all")
	public String adminEndpoint() {
		return "Admin access granted!";
	}

//	@WriteAccess
	@PostMapping("/writting")
	public String writeEndpoint() {
		return "Write access granted!";
	}

//	@ReadAccess
	@GetMapping("/reading")
	public String readEndpoint() {
		return "Read access granted!";
	}
}
