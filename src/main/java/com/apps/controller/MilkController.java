package com.apps.controller;

import com.apps.model.Milk;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/milk")
public class MilkController {

    private final List<Milk> milkList = new ArrayList<>();

    @PostMapping("/g2")
    public ResponseEntity<String> addMilk(@Valid @RequestBody Milk milk) {
        milkList.add(milk);
        return new ResponseEntity<>("Milk added successfully", HttpStatus.CREATED);
    }

    @GetMapping("/g1")
    public ResponseEntity<List<Milk>> getAllMilk() {
        return new ResponseEntity<>(milkList, HttpStatus.OK);
    }
}
