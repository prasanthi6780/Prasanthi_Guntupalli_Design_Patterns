package com.epam.Design_Pattern_TemplateMethod;

public class Drummer extends Musician{
    @Override
    protected void prepare() {
        System.out.println("Melody");
    }

    @Override
    protected void proccess() {
        System.out.println("Telugu Melody");
    }

    @Override
    protected void finish() {
        System.out.println("Meet you next time");
    }
}