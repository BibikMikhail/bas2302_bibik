package ru.mfa.bas2302_bibik.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Device {

    @NotBlank
    private String id;
    @NotBlank
    private String name;
    @Valid
    private Room room;
}
