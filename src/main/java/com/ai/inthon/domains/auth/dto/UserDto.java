package com.ai.inthon.domains.auth.dto;

import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

/**
 * DTO for {@link com.ai.inthon.domains.auth.entity.User}
 */
public record UserDto(@NotNull String id, @NotNull String name, @NotNull String username) implements Serializable {
}