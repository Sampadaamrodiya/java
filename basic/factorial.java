package basic;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("enter a number: ");
        Scanner object = new Scanner(System.in);
        int num=object.nextInt();
        int result=1;
        for(int i=1;i<=num;i++){
            result=result*i;
        }
        System.out.println("factorial of "+num+" is : "+result);
    }
}
