package com.apps.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MilkController {

    @GetMapping("/")
    public ResponseEntity<String> welcome() {
        return new ResponseEntity<>("have a nice day...!!!", HttpStatus.OK);
    }

    @GetMapping("/greetings")
    public ResponseEntity<String> greet() {
        return new ResponseEntity<>("greeting message...!!!", HttpStatus.OK);
    }


}// class loop end.
