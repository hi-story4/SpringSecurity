package com.ai.inthon.domains.auth.entity;

import java.util.Collection;
import java.util.Collections;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


public class CustomUserDetails implements UserDetails {

  private final User user;

  //    private final Collection<? extends GrantedAuthority> authorities;

  public CustomUserDetails(User user) {
    this.user = user;
    //        this.authorities = roles.stream()
    //                .map(role -> new SimpleGrantedAuthority(role.getName()))
    //                .collect(Collectors.toList());

  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return Collections.emptyList();
    //authorities
  }

  @Override
  public String getPassword() {
    return this.user.getPassword();
  }

  @Override
  public String getUsername() {
    return this.user.getUsername();
  }

  public String getUserId() {return this.getUserId();}

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }
}
