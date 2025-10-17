package ru.mfa.bas2302_bibik.model;

import lombok.Data;

@Data
public class Device {
    private String id;
    private String name;
    private String type;
    private boolean status;
    private String room;
}
