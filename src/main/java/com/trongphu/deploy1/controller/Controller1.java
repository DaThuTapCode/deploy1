package com.trongphu.deploy1.controller;

import com.trongphu.deploy1.Entity.Personal;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "deploy1")
public class Controller1 {

    @GetMapping(value = "get-info-ntp")
    public ResponseEntity<?> getInfoNtp () {
        Personal personal = new Personal("Nguyễn Trọng Phú", "0987654321", "Lạng Sơn", "13/09/2004");
        return new ResponseEntity<>(personal, HttpStatus.OK);
    }

}
