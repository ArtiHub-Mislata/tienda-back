package com.proyect.artyhub_back.domain.service.presentationDto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record UserPresentationDto(
        @NotNull(message = "El id es obligatorio")
        Long id,
        @NotNull(message = "El nombre es obligatorio")
        String name,
        @NotNull(message = "El email es obligatorio")
        String email,
         @NotNull(message = "La contraseña es obligatoria")
        String password,
         @Size (min = 24, max = 24)
        String nAccount,
        @Size (max=250)
        String description,
        String address,
         String imageProfileUrl
) {



}
