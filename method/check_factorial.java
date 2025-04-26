package method;
import java.util.Scanner;

public class check_factorial {
    static void factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        fact*=i;
        System.out.println("factorial: "+fact);

        if(fact%2==0)
        System.out.println("factorial is even");
        else
        System.out.println("factorial is odd");
    }
    public static void main(String[] args) {
        System.out.println("enter a number: ");
        Scanner obj = new Scanner(System.in);
        int num=obj.nextInt();
        factorial(num);
    }

    
}
