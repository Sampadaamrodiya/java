import java.util.Scanner;
public class greatestOfTwoNum {
    public static void main(String[] args) {
        System.out.println("enter two numbers a and b: ");
        Scanner object = new Scanner(System.in);
        int a=object.nextInt();
        
        int b=object.nextInt();
        if (a>b)
        System.out.println("a is greater");
        else if (b>a)
        System.out.println("b is greater");
        else
        System.out.println("both are equal");
    }
    
}
