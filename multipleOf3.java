import java.util.Scanner;
public class multipleOf3 {
    public static void main(String[] args) {
        System.out.println("enter a number: ");
        Scanner object = new Scanner(System.in);
        int num=object.nextInt();
        if(num%3==0)
        System.out.println("divisible by 3");
        else
        System.out.println("not divible by 3");
    }
}
