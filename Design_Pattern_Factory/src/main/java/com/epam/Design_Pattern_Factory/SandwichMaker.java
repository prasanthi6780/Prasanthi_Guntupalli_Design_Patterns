package com.epam.Design_Pattern_Factory;

public class SandwichMaker {
	   
    public static void main(String args[]){
       
        Sandwich mySandwich = new WhilteBreadSandwich("White bread Sandwich");
        System.out.printf("Price of %s is Rs%.2f %n", mySandwich.getDescription(), 
                                                     mySandwich.price());
        mySandwich = new CheeseDecorator(mySandwich);
        System.out.printf("Price of %s is Rs%.2f %n", mySandwich.getDescription(), 
                                                     mySandwich.price());
    }
}
