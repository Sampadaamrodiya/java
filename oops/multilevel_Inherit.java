class Animal{
    void animal()
{
    System.out.println("parent class");
}
}
class Dog extends Animal{
    void dog()
    {System.out.println("derived class:single");}
}
class Breed extends Dog{
    void breed()
    {
        System.out.println("derived class: mutiple");
    }

}
public class multilevel_Inherit {
    public static void main(String[] args) {
        Breed obj=new Breed();
        obj.animal();
        obj.dog();
        obj.breed();
        
    }
    }
