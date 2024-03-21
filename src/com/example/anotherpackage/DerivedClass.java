package com.example.anotherpackage;
import com.example.protectedaccess.BaseClass;
public class DerivedClass extends BaseClass {
    public void accessProtectedMembers() {
        protectedField = 100;
        protectedMethod();
    }
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();
        instance.accessProtectedMembers();
    }
}