package method;
import java.util.Scanner;

public class sum {
    static void sum2(int x,int y)
    {
        System.out.println("Sum: "+(x+y));
    }
    public static void main(String[] args) {
        System.out.println("enter two numbers: ");
        Scanner sc= new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        sum2(num1,num2);
    }
    
}
