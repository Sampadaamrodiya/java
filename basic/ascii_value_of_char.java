package basic;
import java.util.Scanner;
public class ascii_value_of_char {
    public static void main(String[] args) {
        System.out.println("enter a character: ");
        Scanner object = new Scanner(System.in);
        char ch=object.next().charAt(0);
        int value=(int)ch;
        System.out.println("ASCII value of "+ch+" is : "+value);
    }
    
}
