package method;
import java.util.Scanner;

public class sumdDigit_method {
    static void sum(int x)
    {  int sum=0;
       
       while(x!=0)
       { 
        sum+=x%10;
        x/=10;
       }
       System.out.println("Sum of digits: "+sum);
    }
    public static void main(String[] args) {
        System.out.println("enter a number:");
        Scanner sc =new Scanner(System.in);
        int num= sc.nextInt();
        sum(num);

    }
    
}
