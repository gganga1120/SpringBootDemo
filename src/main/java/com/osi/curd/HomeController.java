package com.osi.curd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/gitWelcome")
	public String gitWelcome() {
		return "Git welcome123";
	}
}
