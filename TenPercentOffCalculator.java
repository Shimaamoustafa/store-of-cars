/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objectorientedprograming;

/**
 *
 * @author mariamragaai
 */
public class TenPercentOffCalculator implements DiscountCalculator {
    @Override
    public double calculateDiscount(double originalPrice) {
        return originalPrice * 0.1;
    }
}
