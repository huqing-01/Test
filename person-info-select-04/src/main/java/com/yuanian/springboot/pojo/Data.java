package com.yuanian.springboot.pojo;


import com.yuanian.springboot.pojo.Person;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class Data {
    private static Map<String, Person> persons = null;
    static {
        persons = new HashMap<String , Person>();
        persons.put("1",new Person("1","胡庆","技术开发部"));
        persons.put("2",new Person("2","马广交","人力资源部"));
        persons.put("3",new Person("3","刘睿祺","产品研发部"));
        persons.put("4",new Person("4","常瑞","共享交付部"));
    }

    public static Person getPersonByUsercode(String usercode){
        return persons.get(usercode);
    }

}