package basic;
import java.util.Scanner;

public class strong_number {
    public static void main(String[] args) {
        System.out.println("enter a number to check if its a stronh number: ");
        Scanner object= new Scanner(System.in);
        int num=object.nextInt();
        int temp=num;
        int factsum=0;
        while(temp!=0)
        {
            int digit=temp%10;
            temp/=10;
            int fact=1;
            for(int i=1;i<=digit;i++)
            {
                fact=fact*i;
            }
            factsum=factsum+fact;
        }
        if(factsum==num)
        System.out.println("Strong number");
        else 
        System.out.println("not a Strong number");        
    }
    
}
