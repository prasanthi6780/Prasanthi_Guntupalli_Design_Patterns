package com.epam.Design_Pattern_Composite;

import java.util.LinkedList;
import java.util.List;
public abstract class AbstractContainer implements Drawable {

    private List<Drawable> drawables = new LinkedList<>();

    public void drawAll() {
        draw();
        for (Drawable drawable : drawables) {
            drawable.draw();
        }
    }

    public void addElement(Drawable drawable) {
        drawables.add(drawable);
    }
}
