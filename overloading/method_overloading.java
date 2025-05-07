package overloading;
class Parent{
    void sum(int a,int b)
    {System.out.println("sum: "+(a+b));}
    void sum(int a,int b,int c)
    {System.out.println("sum: "+(a+b+c));}
    void sum(double a,double b,double c,double d)
    {System.out.println("sum: "+(a+b+c+d));}
}
public class method_overloading {
    public static void main(String[] args) {
        
    
    Parent obj =new Parent();
    obj.sum(2,4);
    obj.sum(2,4,2);
    obj.sum(2.12344,4.5477,3.2345,5.54);
    }
    
}
