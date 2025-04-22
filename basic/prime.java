package basic;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        System.out.println("enter a number: ");
        Scanner object = new Scanner(System.in);
        int num=object.nextInt();
        boolean isprime=true;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
           { isprime=false;
            break;}
        }
        if(isprime)
        System.out.println("prime number");
        else
        System.out.println("not prime");
    }
}
