package overloading;
class Shape{
    void area(double length,double breadth)
    {   if(length==breadth)
        System.out.println("Area of Square: "+(length*length));
        else
        System.out.println("Area of Rectangle: "+(length*breadth));
    }
    void area(double radius)
    {
        System.out.println("Area of Circle: "+(3.14*radius*radius));
    }
    void area(double base,double height, boolean istriangle)
    {
        if(istriangle)
        System.out.println("Area of Triangle: "+(0.5*base*height));
    }

}
public class Area {
    public static void main(String[] args) {
        Shape obj=new Shape();
        obj.area(2.31);
        obj.area(3.44,4.30);
        obj.area(4,4);
        obj.area(2,4,true);
    }
    
}
