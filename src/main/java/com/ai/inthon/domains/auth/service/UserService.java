package com.ai.inthon.domains.auth.service;

import com.ai.inthon.domains.auth.dto.UserDto;
import com.ai.inthon.domains.auth.dto.UserReqDto;

public interface UserService {
    UserDto postUser(UserReqDto req);
}
