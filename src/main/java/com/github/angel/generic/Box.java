package com.github.angel.generic;

import java.util.List;

public class Box<T> {
    private  T values;

    public Box() {
    }

    public Box(T values) {
        this.values = values;
    }

    public T getValues() {
        return values;
    }

    public void setValues(T values) {
        this.values = values;
    }

    public  <T> void addBox(T u, List<Box<T>> boxes){
        Box<T> box = new Box<>();
        box.setValues(u);
        boxes.add(box);
    }

    public void outBoxes (List<Box<T>> boxes){
        int counter = 0;
        for(Box<T> box:boxes){
            System.out.print("Box # " + counter + "contains [ ");
            counter++;
        }
    }

    public static void main(String[] args) {

    }
}
