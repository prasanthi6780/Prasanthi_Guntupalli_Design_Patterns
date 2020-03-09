package com.epam.Design_Pattern_Composite;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
        AbstractContainer abstractContainer = new Window();

        abstractContainer.addElement(new Button());
        abstractContainer.addElement(new Button());
        abstractContainer.addElement(new Button());
        abstractContainer.addElement(new Button());
        abstractContainer.addElement(new Checkbox());
        abstractContainer.addElement(new Checkbox());
        abstractContainer.addElement(new Checkbox());
        abstractContainer.addElement(new Checkbox());
        abstractContainer.addElement(new Checkbox());

        abstractContainer.drawAll();
    }
}
