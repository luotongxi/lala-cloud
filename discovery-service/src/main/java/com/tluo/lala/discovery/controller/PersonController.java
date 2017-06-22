package com.tluo.lala.discovery.controller;

import com.tluo.lala.discovery.conf.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by edz on 2017/6/22.
 */
@RestController
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    private Person person;

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public String getPerson() {
        return person.getName();
    }
}
