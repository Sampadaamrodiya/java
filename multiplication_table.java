import java.util.Scanner;
public class multiplication_table {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner object = new Scanner(System.in);
        int num=object.nextInt();
        System.out.println("multiplication table of "+num);
        for(int i=1;i<=10;i++)
        {
            System.out.print((num*i)+"  ");
        }
    }
    
}
