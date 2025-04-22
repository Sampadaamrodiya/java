package basic;
import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        System.out.println("enter a number: ");
        Scanner object = new Scanner(System.in);
        int num=object.nextInt();
        if(num%2==0)
        System.out.println("Even");
        else
        System.out.println("Odd");
    }
}
