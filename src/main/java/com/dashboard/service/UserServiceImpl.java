package com.dashboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.dashboard.dto.UserDto;
import com.dashboard.model.User;
import com.dashboard.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User save(UserDto userDto) {
		User user=new User(userDto.getEmail(),passwordEncoder.encode(userDto.getPassword()),userDto.getFullName(),userDto.getRole());
		return userRepository.save(user);
	}

}
