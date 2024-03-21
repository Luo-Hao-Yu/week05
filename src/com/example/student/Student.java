package com.example.student;
import com.example.person;
public class Student extends person {
    private String school;
    public Student(String name, int age, String  school){
        super(name, age);
        this.school = school;
    }
    public void setSchool(String school){
        this.school = school;
    }
    public String getSchool(){
        return school;
    }

    public static void main(String[] args) {
        Student s = new Student("花花",18,"SXU");
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getSchool());
    }
}
