package com.ai.inthon;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class InthonApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void encode(){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encoded =  encoder.encode("1234");
        System.out.println(encoded);

        }

    }
