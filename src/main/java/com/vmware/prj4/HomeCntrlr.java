package com.vmware.prj4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeCntrlr {
    @GetMapping("/home")
    public String Home()
    {
        return "Hey you";
    }
}
