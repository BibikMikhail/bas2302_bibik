package ru.mfa.bas2302_bibik.service;

import org.springframework.stereotype.Service;
import ru.mfa.bas2302_bibik.model.Device;

import java.util.HashMap;
import java.util.Map;

@Service
public class DeviceService {

    private final Map<String, Device> devices = new HashMap<>();

    public Device createDevice(Device device){
        devices.put(device.getId(), device);
        return device;
    }

    public Device getDevice(String id){
        return devices.get(id);
    }

    public Device updateDevice(String id, Device device){
        devices.put(id, device);
        return device;
    }

    public void deleteDevice(String id){
        devices.remove(id);
    }

}
