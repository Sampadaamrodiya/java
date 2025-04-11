import java.util.Scanner;

public class divisibilityBy5and11 {
   public static void main(String[] args) {
     System.out.println("enter a number: ");
      Scanner object = new Scanner(System.in);
      int num=object.nextInt();
    if(num%5==0 &&num%11==0)
    System.out.println("divisible by 5 and 11");
    else
    System.out.println("not divisible by 5 and 11");
   }
}
