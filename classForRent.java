/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objectorientedprograming;

/**
 *
 * @author mariamragaai
 */
public class classForRent {
    private double price;
    double numofmounth;

    public classForRent(double numofmounth) {
        this.numofmounth = numofmounth;
    }

    public double getNumofmounth() {
        return numofmounth;
    }

    public void setNumofmounth(double numofmounth) {
        this.numofmounth = numofmounth;
    }
         

   public double priceForMotorCars()
           {System.out.println("the price of one month = 2000");
               if( numofmounth>3)
               {
                  price=  (numofmounth*2000);
                  
                  System.out.println("you will have take 10% discound, price to rent a motor car before discound="+price);
                  System.out.println(" price to rent a motor car after discound=");
                 }
               else{price=  (numofmounth*2000);
                   System.out.println(" price to rent a motor car="+price);
               }
        return  price;
}
   
   public double priceForTaxi()
           {System.out.println("the price of one month = 3000");
               if( numofmounth>3)
               {
                  price=  ((numofmounth*3000));
                  System.out.println("you will have take 10% discound, price to rent taxi before discound="+price);
                  System.out.println(" price to rent taxi after discound=");
                 }
               else{price= (numofmounth*3000);
                   System.out.println(" price to rent taxi="+price);
               }
        return  price;
}
   
   public double priceFortruck()
           {System.out.println("the price of one month = 5000");
               if( numofmounth>3)
               {
                  price= (numofmounth*5000);
                  System.out.println("you will have take 10% discound,price to rent truck before discound="+price);
                   System.out.println("price to rent truck after discound=");
                 }
               else{price=(numofmounth*5000);
                   System.out.println("your price to rent truck="+price);
               }
        return  price;
}
}
