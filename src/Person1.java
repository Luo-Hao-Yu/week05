public class Person1 {
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        Person1 person1 =new Person1();
        person1.setName("tom");
        System.out.println(person1.getName());
    }
}
