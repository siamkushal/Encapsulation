package com.siam.scjpexamples;

public class Box {
    /* protect the instance variable; only the instance of box can access it */
    private int size;
    //provide public getter and setters
    public int getSize() {
        return size;
    }
    public void setSize(int newSize) {
        size = newSize;
    }
}
