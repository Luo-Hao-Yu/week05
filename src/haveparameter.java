class Animal2{
    String name;
    Animal2(String name){
        this.name = name;
    }
}
class Dog2 extends Animal2{
        Dog2(String name){
            super(name);
            System.out.println("有参继承");
        }
}
public class haveparameter {
    public static void main(String[] args) {
        Dog2 dog = new Dog2("tom");
        System.out.println(dog.name);
    }
}
