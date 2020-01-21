package com.cts.project.hateoas.resthateoas.model;
import org.springframework.hateoas.ResourceSupport;

import java.util.Objects;

public class Users extends ResourceSupport {
    private String name;
    private int age;


    public Users(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
