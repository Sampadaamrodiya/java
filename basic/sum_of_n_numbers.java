package basic;
import java.util.Scanner;
public class sum_of_n_numbers {
    public static void main(String[] args) {
        System.out.println("enter a number: ");
        Scanner object = new Scanner(System.in);
        int num=object.nextInt();
        int result=0 ; int i=0;
        while(i<=num)
        {
            result=result+i;
            i++;
        }
        System.out.println("sum of first "+num+" numbers: "+result);
    }
    
}
