package com.yuanian.springboot.controller;

import com.yuanian.springboot.pojo.Data;
import com.yuanian.springboot.pojo.Person;

import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
public class personController {

    @Autowired
    private Data data;

    @PostMapping("person")
    public Person getData(@RequestBody JSONObject jsonobject) {
        System.out.println(jsonobject);
        return Data.getPersonByUsercode((jsonobject.getString("usercode")));
    }

}
