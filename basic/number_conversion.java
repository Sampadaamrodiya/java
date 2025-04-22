package basic;
import java.util.Scanner;
class number_conversion {
    public static void main(String[] args) {
        System.out.println("enter a number : ");
        Scanner object= new Scanner(System.in);
        int a = object.nextInt();
        switch(a){
            case 1:System.out.println("one"); break;
            case 2:System.out.println("two"); break;
            case 3:System.out.println("three"); break;
            case 4:System.out.println("four"); break;
            case 5:System.out.println("five"); break;
            case 6:System.out.println("six"); break;
            case 7:System.out.println("seven"); break;
            case 8:System.out.println("eight"); break;
            case 9:System.out.println("nine"); break;
            case 10:System.out.println("ten"); break;
            default : System.out.println("invalid input : range limit 1-10");
        }

    }
    
}
