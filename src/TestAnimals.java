class Animal{
    void eat(){
        System.out.println("动物吃东西");
    }
    void sleep(){
        System.out.println("动物睡觉");
    }
}

class Dog extends Animal{
        void eat(){
            System.out.println("狗吃骨头");
        }
        void bark(){
            System.out.println("狗叫");
        }
        private String name;
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        public Dog(String name){
            this.setName(name);
        }
}

public class TestAnimals {
    public static void main(String[] args) {
        Dog myDog = new Dog("点点");
        myDog.eat();
        myDog.bark();
        myDog.sleep();
        System.out.println("狗的名字是："+myDog.getName());
    }
}
