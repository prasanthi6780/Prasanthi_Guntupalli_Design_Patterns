package com.epam.Design_Pattern_Composite;

public class Button extends AbstractContainer {
    @Override
    public void draw() {
        System.out.println("I'm button");
    }
}
