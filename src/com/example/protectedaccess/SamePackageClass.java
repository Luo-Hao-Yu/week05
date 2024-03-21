package com.example.protectedaccess;
public class SamePackageClass extends BaseClass {
    public void accessProtectedMembers() {
        protectedField = 42;
        protectedMethod();
        SamePackageClass anotherInstance = new SamePackageClass();
    }
    public SamePackageClass() {
        super();
    }
    public static void main(String[] args) {
        SamePackageClass instance = new SamePackageClass();
        instance.accessProtectedMembers();
    }
}
