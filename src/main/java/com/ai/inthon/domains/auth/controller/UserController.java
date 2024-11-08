package com.ai.inthon.domains.auth.controller;

import com.ai.inthon.constant.response.ApiResponse;
import com.ai.inthon.domains.auth.dto.UserDto;
import com.ai.inthon.domains.auth.dto.UserReqDto;
import com.ai.inthon.domains.auth.service.UserService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @GetMapping("/private")
    public ResponseEntity<ApiResponse<String>> homeController() {
        return ApiResponse.createSuccessWithOk("home");
    }


    @GetMapping("/private/index")
    public ResponseEntity<ApiResponse<String>> indexController() {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication != null && authentication.isAuthenticated()) {

        }
        String username = authentication.getName();  // 인증된 사용자 이름

        // 3. 현재 인증된 사용자 정보 가져오기
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();

        return ApiResponse.createSuccessWithOk("username" + username+ "userDetails"+ userDetails.getUsername());

    }


    @PostMapping("/user")
    public ResponseEntity<ApiResponse<UserDto>> registerUser(@RequestBody UserReqDto req){
        UserDto resp = userService.postUser(req);

        return ApiResponse.createSuccessWithOk(resp);
    }
}
