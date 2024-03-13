package com.example.allviews;

public class ContactData {
    private String name;
    private String number;
    public ContactData(String name, String number) {
        this.name = name;
        this.number = number;
    }
    public String getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }
}
