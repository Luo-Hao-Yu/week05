 public class Person {
    String name;
    int age;
    static int numberOfPersons = 0;
    public Person(){
        numberOfPersons++;
    }
    public static void displayCount(){
        System.out.println("Total persons created:"+numberOfPersons);
    }
    public static void main(String[] args){
        Person.displayCount();
        new Person();
        Person.displayCount();
    }
}