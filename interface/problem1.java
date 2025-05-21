interface walkable
{
    void walk();
}
interface runnable
{
    void run();
}
class Human implements walkable,runnable{
    public void walk()
    {System.out.println("walk");}
    public void run()
    {System.out.println("run");}
}
public class problem1{
    public static void main(String[] args) {
        Human obj=new Human();
        obj.walk();
        obj.run();
    }
}