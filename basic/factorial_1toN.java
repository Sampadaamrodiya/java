package basic;
import java.util.Scanner;
public class factorial_1toN {
    public static void main(String[] args) {
        
    System.out.print("enter a number: ");
    Scanner obj= new Scanner(System.in);
    int num=obj.nextInt();
    for(int i=1;i<=num;i++)
    {
        int fact=1;
        for(int j=1;j<=i;j++)
        {
            fact*=j;
        }
        System.out.println(i+"! = "+fact);
    }
}
    
}
