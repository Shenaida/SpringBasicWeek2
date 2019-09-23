package com.minorjavaweb.startspringboot.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HelloController {

    //http://localhost:8080/reverse?name=shenaida will display "Hello: adianehs"
    @ResponseBody
    public String reverse(@RequestParam String name)
    {
        String reverse = "";

        for(int i = name.length() - 1; i >= 0; i--)
        {
            reverse = reverse + name.charAt(i);
        }
        return "Hello: " + reverse;
    }
}
