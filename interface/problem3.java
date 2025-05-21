interface Animal{
    void makesound();
}

class Dog implements Animal{
    public void makesound()
    {
        System.out.println("bark");
    }
}


public class problem3 {
    public static void main(String[] args) {
        Animal obj=new Dog();
        obj.makesound();
    }
    
}

