package basic;
import java.util.Scanner;
public class pos_neg_zero {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int num=object.nextInt();
        if(num>0)
        System.out.println("Positive");
        else if(num<0)
        System.out.println("Negative");
        else
        System.out.println("Zero");
    }
    
}
