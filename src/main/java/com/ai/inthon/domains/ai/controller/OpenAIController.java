package com.ai.inthon.domains.ai.controller;

import com.ai.inthon.constant.response.ApiResponse;
import com.ai.inthon.domains.ai.service.OpenAIService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/ai")
@Controller
@RequiredArgsConstructor
public class OpenAIController {

    private final OpenAIService openAIService;

    @GetMapping()
    public ResponseEntity<ApiResponse<String>> getApiResponse(){


        return ApiResponse.createSuccessWithOk("index");
    }
}

