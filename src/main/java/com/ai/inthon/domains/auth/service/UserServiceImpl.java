package com.ai.inthon.domains.auth.service;

import com.ai.inthon.domains.auth.dto.UserDto;
import com.ai.inthon.domains.auth.dto.UserReqDto;
import com.ai.inthon.domains.auth.entity.User;
import com.ai.inthon.domains.auth.mappper.UserMapper;
import com.ai.inthon.domains.auth.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    public UserDto postUser(UserReqDto req){

      User user= userRepository.save(userMapper.toUser(req));

      return userMapper.toDto(user);
    }
}
