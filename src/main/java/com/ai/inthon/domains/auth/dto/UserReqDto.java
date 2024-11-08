package com.ai.inthon.domains.auth.dto;

import jakarta.validation.constraints.NotNull;

public record UserReqDto(@NotNull String name, @NotNull String username,
                         @NotNull String password) {
}
