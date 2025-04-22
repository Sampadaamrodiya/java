package basic;
import java.util.Scanner;
 class calculator_switchcase {
    public static void main(String[] args) {
        System.out.println("enter two numbers: ");
        Scanner object= new Scanner(System.in);
        int a=object.nextInt();
        int b=object.nextInt();
        System.out.println("enter operator: ");
        char o=object.next().charAt(0);
        switch(o){
            case '+': System.out.println("Addition : "+(a+b));  break;
            case '-': System.out.println("Subtraction : "+(a-b));  break;
            case '*': System.out.println("Multiplication : "+(a*b));  break;
            case '/': System.out.println("Division : "+(a/b));  break;
            default : System.out.println("Invalid operation");

        }
    }  
}
