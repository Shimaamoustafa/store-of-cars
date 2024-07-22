/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objectorientedprograming;

/**
 *
 * @author mariamragaai
 */
public class Employee extends Person {
        private int employeeid;
        private double salary;

        public Employee(int employeeid, double salary, String name, String address, String PhoneNumber) {
            super(name, address, PhoneNumber);
            this.employeeid = employeeid;
            this.salary = salary;
        }
        public int getEmployeeid(){
            return employeeid;
        }
        public double getsalary(){
            return salary;
        }

        public void setEmployeeid(int employeeid) {
            this.employeeid = employeeid;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
}
        
