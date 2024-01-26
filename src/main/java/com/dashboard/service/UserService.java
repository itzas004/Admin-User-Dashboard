package com.dashboard.service;

import com.dashboard.dto.UserDto;
import com.dashboard.model.User;

public interface UserService {
	User save(UserDto userDto);
}
