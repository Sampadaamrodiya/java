package method;

import java.util.Scanner;

public class return_Sum {
    static int sum(int x ,int y)
    {   //return sum
        return x+y;
    }
    static int max(int sum)
    {   //return max digit of sum
        int max_digit=0;
        while(sum!=0)
        {
            int rem=sum%10;
            if(max_digit<rem)
            max_digit=rem;
            sum/=10;
        }
        return max_digit;
    }
    public static void main(String[] args) {
        System.out.println("enter two numbers: ");
         Scanner sc= new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int res=sum(num1,num2);
        System.out.println("sum: "+res);
        System.out.println("Largest digit: "+ max(res));

    }
    
}
