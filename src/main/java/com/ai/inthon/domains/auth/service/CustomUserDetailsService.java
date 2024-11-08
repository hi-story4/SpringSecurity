package com.ai.inthon.domains.auth.service;

import com.ai.inthon.domains.auth.entity.CustomUserDetails;
import com.ai.inthon.domains.auth.entity.User;
import com.ai.inthon.domains.auth.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException(username+" 가 존재하지 않습니다. "));
//        Set<Role> roles = foundUser.getRoles();

        return new CustomUserDetails(user);
    }

}
