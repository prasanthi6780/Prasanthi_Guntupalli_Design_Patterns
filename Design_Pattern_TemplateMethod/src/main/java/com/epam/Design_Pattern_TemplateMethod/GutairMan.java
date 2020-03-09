package com.epam.Design_Pattern_TemplateMethod;

public class GutairMan extends Musician {
    @Override
    protected void prepare() {
        System.out.println("drink");
    }

    @Override
    protected void proccess() {
        System.out.println("брынь брынь");
    }

    @Override
    protected void finish() {
        System.out.println("протереть пивом струны");
    }
}