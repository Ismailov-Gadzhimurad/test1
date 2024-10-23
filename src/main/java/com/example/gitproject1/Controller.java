package com.example.gitproject1;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")

public class Controller {

    @PostMapping("/{message}")
    public String sendMessage(@PathVariable("message") String message){
        return message;
    }

}
