/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objectorientedprograming;

/**
 *
 * @author mariamragaai
 */
public class Buycar {
   private  int price;
    private double amount;

    public Buycar(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public double priceFortruk(double amount,String name)
    {  price =3000000;
        if (amount >= price) {
        amount -= price;
        System.out.println("Payment of " + price + " processed for customer: " + name);
    } else {
        System.out.println("Insufficient balance to process payment for customer: " + name);
    }
        return price;      
    }
    
    
            
    public double priceForMotorCar(double amount,String name)
             {   price= 2750000;
                 
                 
                 if (amount >= price) {
        amount -= price;
        System.out.println("Payment of " + price + " processed for customer: " + name);
    } else {
        System.out.println("Insufficient balance to process payment for customer: " + name);
    }
        return price;      
             }
     public double priceForTaxi(double amount,String name)
     {
         price= 150000000;
         if (amount >= price) {
        amount -= price;
        System.out.println("Payment of " + price + " processed for customer: " + name);
    } else {
        System.out.println("Insufficient balance to process payment for customer: " + name);
    }
        return price;      
     }
      
}
