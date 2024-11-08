package com.ai.inthon.domains;


import com.ai.inthon.constant.response.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/login")
@Slf4j
public class indexController {

    @GetMapping()
    public ResponseEntity<ApiResponse<String>> getIndex(){
      log.info("login filter 뚫었나?");
        return ApiResponse.createSuccessWithOk("login");
    }
}
