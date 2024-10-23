package com.example.gitproject1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "client2", url = "http://localhost:8080/api")

public interface Client2 {


    @PostMapping(value = "/send")
    String getMessage(@RequestBody String message);

}
