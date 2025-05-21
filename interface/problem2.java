interface A{
    void display();
}
interface B{
    void display();
}
class Demo implements A,B{
    public void display()
    {
        System.out.println("display method implemented in demo class");
    }
}


public class problem2 {
    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.display();
    }
    
}
