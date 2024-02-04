package com.letcode.SecureBankSystem.Controller;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


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

    private List<Contact> contacts = new ArrayList<>();

    @PostMapping("/addContact")
    public String addContact(@RequestBody ContactRequest contactRequest) {
        String name = contactRequest.getName();
        String email = contactRequest.getEmail();
        String phone = contactRequest.getPhone();

        Contact newContact = new Contact(name, email, phone);
        contacts.add(newContact);

        return "Contact added successfully!";
    }

    @GetMapping("/getContactDetails")
    public Contact getContactDetails(@RequestParam String name) {
        return findContactByName(name);
    }

    private Contact findContactByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }
}