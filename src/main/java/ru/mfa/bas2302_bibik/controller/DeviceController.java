package ru.mfa.bas2302_bibik.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.mfa.bas2302_bibik.model.Device;
import ru.mfa.bas2302_bibik.service.DeviceService;

@RestController
@RequestMapping("/devices")
public class DeviceController{

    private final DeviceService deviceService;

    public DeviceController(DeviceService deviceService){
        this.deviceService = deviceService;
    }

    @PostMapping
    public Device createDevice(@RequestBody Device device){
        return deviceService.createDevice(device);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Device> getDevice(@PathVariable String id){
        Device device = deviceService.getDevice(id);
        if (device == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(device);
    }

    @PutMapping("/{id}")
    public Device updateDevice(@PathVariable String id, @RequestBody Device device){
        return deviceService.updateDevice(id, device);
    }

    @DeleteMapping("/{id}")
    public void deleteDevice(@PathVariable String id){
        deviceService.deleteDevice(id);
    }


}
