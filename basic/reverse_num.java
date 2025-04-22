package basic;
import java.util.Scanner;

public class reverse_num {
    public static void main(String[] args) {
        System.out.println("enter a number: ");
        Scanner object = new Scanner(System.in);
        int num=object.nextInt();
        int rev_num=0;
        while(num!=0)
        {
            int temp=num%10;
            rev_num=rev_num*10 + temp;
            num/=10;
        }
        System.out.println("reversed number : "+rev_num);

    }
}
