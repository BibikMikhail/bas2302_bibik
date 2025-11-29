package ru.mfa.bas2302_bibik.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Event {

    @NotBlank
    private String id;
    @NotBlank
    private String type;
    @NotBlank
    private String value;
    @NotBlank
    private String deviceId;


}
