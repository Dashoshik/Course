package com.company;

/**
 * Created by student on 01-Oct-17.
 */
public class Phone {
    long number;
    String model;
    double weight;


 void receiveCall (String name){
     System.out.println("Звонит "+name);
 }
    long getPhoneNumber (){
        return number;
    }
}