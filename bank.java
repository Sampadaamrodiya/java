import java.util.ArrayList;
import java.util.*;

class Transactions{
    String Type;
    double amount;
    public Transactions(String type,double amount){
        this.type=type;
        this.amount=amount;
    }
}
class Account{
    // private String name;
    // private int accountnumber;
    // private double balance;
    // public Account (String name,int accountnumber,double balance)
    // {
    //    this.name= name;
    //    this.accountnumber=accountnumber;
    //    this.balance=balance;
    // }
    // ArrayList<Transactions> transactions=new ArrayList<>();
    // public void deposite( double amount)
    // {
    //     if(amount>0)
    //     {
    //         balance+=amount;
    //         System.out.println("Amount deposited successfully");

    //     }
    // }
    class createAcc{
    private String name;
    private String type;
    double balance=0;
    void getname(){
        Scanner name = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String holderName = name.next();
    }
    void getaccType(){
        Scanner accType = new Scanner(System.in);
        System.out.print("Enter account type: ");
        System.out.println("Please enter 'savings' or 'current'.");
        String accountType = accType.next();
       //getaccType();  Recursive call to re-enter account type       
    }
    int generateAccNum(){
        Random random = new Random();
        int accNum = random.nextInt(100000, 999999);
        System.out.println("Your Account Number: " + accNum);
        return accNum;

        
    }
}
}

public class bank {
    
    public static void main(String[] args) {
        // Scanner scanner =new Scanner (System.in);
        // String name=scanner.nextLine();
        createAcc acc = new createAcc();
        acc.getname();
        acc.generateAccNum();
        acc.getaccType();


         
    }
}
