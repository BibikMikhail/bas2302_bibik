package ru.mfa.bas2302_bibik.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class User {

    @NotBlank
    private String id;
    @NotBlank
    private String name;
    @Email
    private String email;

}
