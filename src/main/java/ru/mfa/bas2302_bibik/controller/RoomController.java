package ru.mfa.bas2302_bibik.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.ServerRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import jakarta.validation.constraints.Size;


import ru.mfa.bas2302_bibik.model.Room;
import ru.mfa.bas2302_bibik.service.RoomService;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/rooms")
@RequiredArgsConstructor
@Validated
public class RoomController {

    private final RoomService roomService;

    @GetMapping
    public ResponseEntity<Room> getRoom(@RequestParam @Size(min = 3, max = 255) String name){
    return ResponseEntity.ok().body(roomService.getRoom(name));
        }

    @PostMapping
    public ResponseEntity<Room> addRoom(@Valid @RequestBody Room room) {
        return ResponseEntity.status(CREATED).body(roomService.addRoom(room));
    }

    @DeleteMapping
    public ResponseEntity<Void> delRoom(@PathVariable String name){
        roomService.removeRoom(name);
        return ResponseEntity.noContent().build();
    }

}
