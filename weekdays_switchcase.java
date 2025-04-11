import java.util.Scanner;

class weekdays_switchcase {
    public static void main(String[] args) {
        // int a=5;
        // switch(a){
        //     case 1:
        //     case 2:
        //     case 3:
        //     case 4:System.out.println("hi");
        //            break;
        //     case 5:System.out.println("hello");
        //            break;
        //     default : System.out.println("byeee!");
        // }

        //QUESTION: WEEKDAYS
        
           System.out.println("enter a number:");
           Scanner obj =new  Scanner(System.in);
           int a = obj.nextInt();
           switch (a) {
            case 1:System.out.println("Monday");
                break;
            case 2:System.out.println("Tuesday");
                break;
            case 3:System.out.println("Wednesday");
                break;
            case 4:System.out.println("Thursday");
                break;
            case 5:System.out.println("Friday");
                break;
            case 6:System.out.println("Satday");
                break;
            case 7:System.out.println("Sunday");
                break;
            default: System.out.println("wrong input");
                break;
           }


    }
    
}
