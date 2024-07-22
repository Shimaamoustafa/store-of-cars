/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objectorientedprograming;

/**
 *
 * @author mariamragaai
 */
public class Person {
    private String name;
    private String address;
    private String PhoneNumber;

    public Person(String name, String address, String PhoneNumber) {
        this.name = name;
        this.address = address;
        this.PhoneNumber = PhoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }
}