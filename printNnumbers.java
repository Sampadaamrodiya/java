import java.util.Scanner;
//print first n numbers
public class printNnumbers {
   public static void main(String[] args) {
    System.out.println("enter a number:");
    Scanner object = new Scanner(System.in);
    int num=object.nextInt();
        for (int i=1;i<=num;i++)
        {System.out.print(i+"  ");}
   }
    
}
