package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.UserService;
import com.example.demo.web.dto.UserRegistrationDto;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
	
	
	private UserService userService;

	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	
	
	
	@GetMapping
	public String showRegistrationForm() {
		return "registration" ;
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		userService.save(registrationDto);
		return "redirect:/registration?success";
		
	}

}


//package com.example.demo.web;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import com.example.demo.service.UserService;
//import com.example.demo.web.dto.UserRegistrationDto;
//
//@RestController
//@RequestMapping("/api/registration")
//public class UserRegistrationController {
//    
//    private final UserService userService;
//
//    public UserRegistrationController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @PostMapping
//    public ResponseEntity<?> registerUserAccount(@RequestBody UserRegistrationDto registrationDto) {
//        userService.save(registrationDto);
//        return new ResponseEntity<>(HttpStatus.CREATED);
//    }
//}
//
