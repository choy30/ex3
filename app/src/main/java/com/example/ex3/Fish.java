package com.example.ex3;

public class Fish {
    private String name, sname;

    public Fish(String name, String sname) {
        this.name = name;
        this.sname = sname;
    }

    public Fish(){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}
