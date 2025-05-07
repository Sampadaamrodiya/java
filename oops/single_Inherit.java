
class Animal{
    void eat()
    {System.out.println("eat");}
}
class Dog extends Animal{
    void bark()
    {System.out.println("barkk");}
}
public class single_Inherit
{
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.eat();
        obj.bark();
        
    }
}