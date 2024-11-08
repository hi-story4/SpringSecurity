package com.ai.inthon.domains.auth.mappper;

import com.ai.inthon.domains.auth.dto.UserDto;
import com.ai.inthon.domains.auth.dto.UserReqDto;
import com.ai.inthon.domains.auth.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);


    @Mapping(target = "id", ignore = true)
    User toUser(UserReqDto userReqDto);

    UserDto toDto(User user);

}
