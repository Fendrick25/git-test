package com.test.gittest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/test")
public class TestController {

    @GetMapping("/A")
    public ResponseEntity<String> featureA(){
        return new ResponseEntity<>("Feature A", HttpStatus.OK);
    }

    @GetMapping("/B")
    public ResponseEntity<String> featureB(){
        return new ResponseEntity<>("Feature B", HttpStatus.OK);
    }

    @GetMapping("/C")
    public ResponseEntity<String> featureC(){
        return new ResponseEntity<>("Feature C", HttpStatus.OK);
    }
}
