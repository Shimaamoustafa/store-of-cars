/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.objectorientedprograming;

/**
 *
 * @author mariamragaai
 */
import java.io.*;
import java.io.File;
import java.util.InputMismatchException;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class ObjectOrientedPrograming {
    public static void main(String[] args) {
         String stringg="employee";
         int age;
JOptionPane.showMessageDialog(null, "Welcome to our agency!",
"Display Message", JOptionPane.INFORMATION_MESSAGE);
System.out.println("hello dear, let us tell you that any transaction person under 21 years old will be canceld");
System.out.println("Please enter your real age");
try{
 Scanner input=new Scanner (System.in);
 age=input.nextInt();
 if(age>=21){
     try {
         FileWriter fWriter = new FileWriter("/Users/mariamragaai/Desktop/OOP"); 
fWriter.write(age); // Writing into file System.out.println(text); // Printing the contents of a file fWriter.close(); // Closing the file writing connection System.out.println("File created successfully");
}
     catch (IOException e) { 
         ;
}
System.out.println(""
        + "");
     System.out.println("At first let us inroduce our services to you: ");
String[] services = new String[] {"Car washing", "Car repairing", "Car checking","car renting","car buying"}; // Initializing with values
       for(int i =0;i<5;i++){
    System.out.println("service no. "+(i+1)+" is : "+services[i]);
}
       System.out.println("this program is just for renting and buying ,if you want any other service please visit aou agency in Cairo Egypt");
     Scanner inputt=new Scanner (System.in);
    System.out.println("Are you employee or costumer?");
    String person=inputt.nextLine();
    if(person.equals(stringg)){
        System.out.println("you'll have 30% off on all of our services except buying and renting");
        //(int employeeid, double salary, String name, String address, String PhoneNumber) 
            System.out.println("Enter your id");
            Scanner id=new Scanner (System.in);
            int empid = id.nextInt();
            
            System.out.println("Enter your salary");
             Scanner salarys=new Scanner (System.in);
            double salary=salarys.nextDouble();  
            
            System.out.println("Enter your name");
            Scanner names=new Scanner (System.in);
            String name=names.nextLine();
            
             System.out.println("Enter your address");
            Scanner addresss=new Scanner (System.in);
            String address=addresss.nextLine();
            
            System.out.println("Enter your phone number");
            Scanner phonen=new Scanner (System.in);
            String phone_number=phonen.nextLine();
        Employee E1=new Employee(empid,salary,name,address,phone_number);
    }
    else { 
         System.out.println("Enter the number of your visits");
         int number=input.nextInt();
                  if(number==1){
             System.out.println("we hope you find what you need with our agency");
         }
         else{
             System.out.println("you'll have 10% off on car clean sevices");
         }
                  //public customer(int customerid, String email, String payment, double balance, String name, String address, String PhoneNumber)
                  System.out.println("Enter your id");
            Scanner cid=new Scanner (System.in);
            int custid = cid.nextInt();
            
            System.out.println("Enter your Email");
            Scanner eddresss=new Scanner (System.in);
            String email=eddresss.nextLine();
            
            System.out.println("Enter your payment method");
            Scanner paymentm=new Scanner (System.in);
            String payment=paymentm.nextLine();
            
            System.out.println("Enter your name");
            Scanner names=new Scanner (System.in);
            String name=names.nextLine();
            
             System.out.println("Enter your address");
            Scanner addresss=new Scanner (System.in);
            String address=addresss.nextLine();
            
              System.out.println("Enter your phone number");
            Scanner phonen=new Scanner (System.in);
            String phone_number=phonen.nextLine();
           customer c1=new customer(custid,email,payment,name,address,phone_number);       
    }
    System.out.println("To rent a car press press 1");
    System.out.println("To buy a car press press 2"); 
   int choice = input.nextInt();
    int chosenNumber1 = 1;
        int chosenNumber2 = 2;
        switch(choice){
                case 1: System.out.println("what type of cars do you want to rent?");
                System.out.println("To rent a truck press 1");
    System.out.println("To rent a taxi press 2"); 
    System.out.println("To rent a motor cars press 3"); 
                Scanner typee=new Scanner (System.in);
            int type = typee.nextInt();
            switch(type){
                case 1:
//                    public Vehicle(String model,  String type, String color, String company_name)
                    System.out.println("enter year of manfucture");
                    Scanner y=new Scanner (System.in);
                     String year = y.nextLine();
                     System.out.println("automatic or manual?");
                    Scanner typez=new Scanner (System.in);
                     String auto = typez.nextLine();
                      System.out.println("what's your favorite color in cars?");
                    Scanner col=new Scanner (System.in);
                     String colo = col.nextLine();
                     System.out.println("what brand do you prefer?");
                    Scanner br=new Scanner (System.in);
                     String brand = br.nextLine();
                     Car v1=new Car(year,auto,colo,brand);

                    System.out.println("enter number of months");
                    Scanner nom=new Scanner (System.in);
            double numberofmonths = nom.nextFloat();
            classForRent c1=new classForRent(numberofmonths);
            c1.priceFortruck();
            TenPercentOffCalculator t1=new TenPercentOffCalculator();
            
           System.out.println((numberofmonths*5000)-(t1.calculateDiscount(5000))); 
            break;
                case 2:
                     System.out.println("enter year of manfucture");
                    Scanner yy=new Scanner (System.in);
                     String yeary = yy.nextLine();
                     System.out.println("automatic or manual?");
                    Scanner typezz=new Scanner (System.in);
                     String autoo = typezz.nextLine();
                      System.out.println("what's your favorite color in cars?");
                    Scanner colooo=new Scanner (System.in);
                     String coloo = colooo.nextLine();
                     System.out.println("what brand do you prefer?");
                    Scanner brr=new Scanner (System.in);
                     String brandr = brr.nextLine();
                     Car v2=new Car(yeary,autoo,coloo,brandr);
                    System.out.println("enter number of months");
                    Scanner nomm=new Scanner (System.in);
            double numberofmonthss = nomm.nextFloat();
            classForRent c2=new classForRent(numberofmonthss);
            c2.priceForTaxi();
              TenPercentOffCalculator t2=new TenPercentOffCalculator();
           System.out.println((numberofmonthss*3000)-t2.calculateDiscount(3000)); 
            break;
                case 3:
                    System.out.println("enter year of manfucture");
                    Scanner o=new Scanner (System.in);
                     String yearz = o.nextLine();
                     System.out.println("automatic or manual?");
                    Scanner typei=new Scanner (System.in);
                     String autoi = typei.nextLine();
                      System.out.println("what's your favorite color in cars?");
                    Scanner colz=new Scanner (System.in);
                     String colzz = colz.nextLine();
                     System.out.println("what brand do you prefer?");
                    Scanner bz=new Scanner (System.in);
                     String brandz = bz.nextLine();
                     Car v3=new Car(yearz,autoi,colzz,brandz);
                    System.out.println("enter number of months");
                    Scanner nommm=new Scanner (System.in);
            double numberofmonthsss = nommm.nextFloat();
            classForRent c3=new classForRent(numberofmonthsss);
            c3.priceForMotorCars();
              TenPercentOffCalculator t3=new TenPercentOffCalculator();
           System.out.println((numberofmonthsss*2000)-t3.calculateDiscount(2000)); 
            break;}
            
                break;
                
                case 2:System.out.println("what type of cars do you want to rent?");
                System.out.println("To buy a truck press 1");
    System.out.println("To buy a taxi press 2"); 
    System.out.println("To buy a motor cars press 3"); 
                Scanner typie=new Scanner (System.in);
            int types = typie.nextInt();
            switch(types){
                case 1:
                    System.out.println("enter year of manfucture");
                    Scanner o=new Scanner (System.in);
                     String yearz = o.nextLine();
                     System.out.println("automatic or manual?");
                    Scanner typei=new Scanner (System.in);
                     String autoi = typei.nextLine();
                      System.out.println("what's your favorite color in cars?");
                    Scanner colz=new Scanner (System.in);
                     String colzz = colz.nextLine();
                     System.out.println("what brand do you prefer?");
                    Scanner bz=new Scanner (System.in);
                     String brandz = bz.nextLine();
                     Car v3=new Car(yearz,autoi,colzz,brandz);
                     System.out.println("Enter your name that will be writen in the invoice ");
            Scanner names=new Scanner (System.in);
            String name=names.nextLine();
            
                    System.out.println("Enter your balance");
            Scanner balances=new Scanner (System.in);
            Double balance=balances.nextDouble();
                    Buycar b1=new Buycar(balance);
                    b1.priceFortruk(balance,name);
                    break;
                case 2:
                     System.out.println("enter year of manfucture");
                    Scanner yy=new Scanner (System.in);
                     String yeary = yy.nextLine();
                     System.out.println("automatic or manual?");
                    Scanner typezz=new Scanner (System.in);
                     String autoo = typezz.nextLine();
                      System.out.println("what's your favorite color in cars?");
                    Scanner colooo=new Scanner (System.in);
                     String coloo = colooo.nextLine();
                     System.out.println("what brand do you prefer?");
                    Scanner brr=new Scanner (System.in);
                     String brandr = brr.nextLine();
                     Car v2=new Car(yeary,autoo,coloo,brandr);
                     System.out.println("Enter your name that will be writen in the invoice");
            Scanner namess=new Scanner (System.in);
            String namez=namess.nextLine();
                    System.out.println("Enter your balance");
            Scanner balancess=new Scanner (System.in);
            Double balancez=balancess.nextDouble();
                    Buycar b2=new Buycar(balancez);
                    b2.priceForTaxi(balancez,namez);
                    break;
                    
                    case 3:
                        System.out.println("enter year of manfucture");
                    Scanner y=new Scanner (System.in);
                     String year = y.nextLine();
                     System.out.println("automatic or manual?");
                    Scanner typez=new Scanner (System.in);
                     String auto = typez.nextLine();
                      System.out.println("what's your favorite color in cars?");
                    Scanner col=new Scanner (System.in);
                     String colo = col.nextLine();
                     System.out.println("what brand do you prefer?");
                    Scanner br=new Scanner (System.in);
                     String brand = br.nextLine();
                     Car v1=new Car(year,auto,colo,brand);
                         System.out.println("Enter your name that will be writen in the invoice");
            Scanner namezz=new Scanner (System.in);
            String namesss=namezz.nextLine();
                    System.out.println("Enter your balance");
            Scanner balancessz=new Scanner (System.in);
            Double balancezz=balancessz.nextDouble();
                    Buycar b3=new Buycar(balancezz);
                    b3.priceForMotorCar(balancezz,namesss);
                    break;

            }
                break;
                
                default:System.out.println("invalid number,reopen the application");
                break;
               }
         try {
            File carFile = new File("car_details.txt");
            if (carFile.createNewFile()) {
                System.out.println("Car file created: " + carFile.getName());
            } else {
                System.out.println("Car file already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the car file.");
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "See you soon >3",
"Display Message", JOptionPane.INFORMATION_MESSAGE);
 
 }
 else{System.out.println("you are't allowed to make any transaction ");
      System.exit(0);
 }
}
catch(InputMismatchException e){
    System.out.println("you are't allowed to make any transaction ");
     System.exit(0);

}

    
}
}


