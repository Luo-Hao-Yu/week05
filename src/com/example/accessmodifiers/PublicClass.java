package com.example.accessmodifiers;
public class PublicClass {
    public int publicField;

    public void publicMethod() {
        System.out.println("This is a public method.");
    }
    public static void main(String[] args) {
        DefaultClass d = new DefaultClass();
        d.defaultMethod();
    }
}
