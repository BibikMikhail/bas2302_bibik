package ru.mfa.bas2302_bibik.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Room {

    @NotBlank
    private String name;

}
