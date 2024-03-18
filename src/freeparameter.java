class Animal1 {
    String name;

    Animal1() {
        name = "Animal";
    }
}

class Dog1 extends Animal1 {
    Dog1() {
        System.out.println("汪汪汪");
    }
}
public class freeparameter {
    public static void main(String[] args) {
        Dog1 dog = new Dog1();
        System.out.println(dog.name);
    }
}
