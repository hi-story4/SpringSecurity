package com.ai.inthon.config;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.Assert;
import org.springframework.web.cors.*;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Configuration
public class CorsFilter extends OncePerRequestFilter {
    private final CorsConfigurationSource configSource;
    private CorsProcessor processor = new DefaultCorsProcessor();

    public CorsFilter(CorsConfigurationSource configSource) {
        Assert.notNull(configSource, "CorsConfigurationSource must not be null");
        this.configSource = configSource;
    }

    public void setCorsProcessor(CorsProcessor processor) {
        Assert.notNull(processor, "CorsProcessor must not be null");
        this.processor = processor;
    }

    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        CorsConfiguration corsConfiguration = this.configSource.getCorsConfiguration(request);
        boolean isValid = this.processor.processRequest(corsConfiguration, request, response);
        if (isValid && !CorsUtils.isPreFlightRequest(request)) {
            filterChain.doFilter(request, response);
        }
    }
}
