package com.example.demo.service;


import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.web.dto.UserRegistrationDto;


@Service
public class UserServiceImpl  implements UserService{
	
	

	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}



	
	
	
	@Override
	public User save(UserRegistrationDto registrationDto) {
		// TODO Auto-generated method stub
		User user = new User(registrationDto.getFirstname(), registrationDto.getLastname(), registrationDto.getPassword(), 
				registrationDto.getEmail(),  registrationDto.getPhonenumber());
		return userRepository.save(user);
	}

}
