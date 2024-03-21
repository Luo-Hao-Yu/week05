package com.example.protectedaccess;
public class BaseClass {
    protected int protectedField;
    protected void protectedMethod() {
        System.out.println("Protected method called from BaseClass.");
    }
    protected BaseClass() {
        System.out.println("Protected constructor of BaseClass.");
    }
}