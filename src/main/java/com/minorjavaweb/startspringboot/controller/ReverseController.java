package com.minorjavaweb.startspringboot.controller;

import com.minorjavaweb.startspringboot.model.Reverse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class ReverseController {

    @Autowired
    private Reverse reverseName;

    @RequestMapping(value = "reverse", method = RequestMethod.GET)
    public List<String> get() {
        return reverseName.list();
    }

    @RequestMapping(value = "reverse", method = RequestMethod.POST)
    public void create(@RequestBody String name) {
        reverseName.create(name);
    }

    @RequestMapping(value = "reverse/{id}", method = RequestMethod.GET)
    public String get(Long id){
        return reverseName.getById(id);
    }
}
