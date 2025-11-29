package ru.mfa.bas2302_bibik.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AutomationRule {


    @NotBlank
    private String id;
    @NotBlank
    private String name;

    @NotBlank
    private String triggerDeviceId;
    @NotBlank
    private String triggerEventType;

    @NotBlank
    private String actionDeviceId;
    @NotBlank
    private String actionType;

    @Valid
    private User user;
}
