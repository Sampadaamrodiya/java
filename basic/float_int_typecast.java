package basic;
import java.util.Scanner;

public class float_int_typecast {
    public static void main(String[] args) {
        System.out.println("enter a number: ");
        Scanner object = new Scanner(System.in);
        float num=object.nextFloat();
        int num2=(int)num;
        System.out.println("float :"+num);
        System.out.println("integer :"+num2);
    }
    
}
