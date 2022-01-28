package com.laynezcoder.controller;

public class usercls {
    private String ID;
    private String Pass;
    private String Name;


    public usercls(String name, String pass, String ID) {
        Name = name;
        Pass = pass;
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String pass) {
        Pass = pass;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
