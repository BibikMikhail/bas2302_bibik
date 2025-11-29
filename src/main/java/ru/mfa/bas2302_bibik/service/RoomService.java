package ru.mfa.bas2302_bibik.service;


import org.springframework.stereotype.Service;
import ru.mfa.bas2302_bibik.model.Room;

import java.util.HashMap;
import java.util.Map;

@Service
public class RoomService {
    private final Map<String, Room> rooms = new HashMap<>();

    public Room getRoom(String name){
        return rooms.get(name);
    }

    public Room addRoom(Room room){
        rooms.put(room.getName(), room);
        return rooms.get(room.getName());
    }

    public void removeRoom(String name){
        rooms.remove(name);
    }

}
