class Parent{
    void eat()
    {
        System.out.println("parent");
    }
}
class Child extends Parent{
    void eat()
    {
        System.out.println("child");
    }
}
public class hello {
    public static void main(String[] args) {
        Parent obj =new Child();
        obj.eat();

    }
    
}
