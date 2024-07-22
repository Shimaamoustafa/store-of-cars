/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objectorientedprograming;

/**
 *
 * @author mariamragaai
 */
public class Car {
   
    private String model ;
    
     private String type;
    private String color; 
    private String company_name;

    public Car() {
    }

    
    public Car(String model,  String type, String color, String company_name) {
        this.model = model;
        
        this.type = type;
        this.color = color;
        this.company_name = company_name;
    }

    
    
    public void setMode(String model) {
        this.model = model;
    }

   

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName_company(String name_company) {
        this.company_name = company_name;
    }

    public String getModel() {
        return model;
    }

  

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getName_company() {
        return company_name;
    }
}
    
