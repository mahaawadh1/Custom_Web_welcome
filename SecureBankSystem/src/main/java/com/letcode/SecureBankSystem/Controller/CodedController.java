package com.letcode.SecureBankSystem.Controller;


import org.springframework.web.bind.annotation.*;

@RestController("/api/v1")
public class CodedController {

    @GetMapping("/sayHi")
    public String sayHi() {

        return "welcome to coded";

    }

    @GetMapping("/greet")
    public String greet(@RequestParam String name) {

        return "Hello " + name + "!";
    }


    @PostMapping ("/farewell")

    public String farewell(@RequestBody FarewellRequest farewellRequest) {
        String name = farewellRequest.getname();
        return "GoodBye"+ " " + name + "!";

    }
}