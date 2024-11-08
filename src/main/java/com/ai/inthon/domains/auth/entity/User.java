package com.ai.inthon.domains.auth.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

  @Id
  //nosql 기준
  private String id;

  private String name;

  private String username;

  @JsonIgnore
  private String password;
}
