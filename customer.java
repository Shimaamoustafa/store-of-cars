/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objectorientedprograming;

/**
 *
 * @author mariamragaai
 */
  public class customer extends Person{
            private int customerid;
            private String email;
            private String payment;
            
            public customer(int customerid, String email, String payment,  String name, String address, String PhoneNumber) {
                super(name, address, PhoneNumber);
                this.customerid = customerid;
                this.email = email;
                this.payment = payment;
                
            }

            public int getCustomerid() {
                return customerid;
            }

            public void setCustomerid(int customerid) {
                this.customerid = customerid;
            }
            

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getPayment() {
                return payment;
            }

            public void setPayment(String payment) {
                this.payment = payment;
            }
      
        }
        
        
    
