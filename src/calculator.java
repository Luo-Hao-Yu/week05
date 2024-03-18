class calculator1 {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }
    public static void main(String[] args) {
        calculator1 c = new calculator1();
        System.out.println(c.add(2, 3));
        System.out.println(c.add(2, 3.4));
        System.out.println(c.add(2, 3,5));
    }
}
public class calculator{
    public static void main(String[] args) {
        calculator1 c = new calculator1();
        System.out.println(c.add(3, 3));
        System.out.println(c.add(5, 3.4));
        System.out.println(c.add(20, 3,5));
    }
}
