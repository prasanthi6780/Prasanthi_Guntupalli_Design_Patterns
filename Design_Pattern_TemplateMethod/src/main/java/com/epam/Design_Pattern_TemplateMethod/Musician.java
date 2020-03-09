package com.epam.Design_Pattern_TemplateMethod;

public abstract class Musician {

    public void play() {
        prepare();
        proccess();
        finish();
    }

    protected abstract void prepare();
    protected abstract void proccess();
    protected abstract void finish();
}