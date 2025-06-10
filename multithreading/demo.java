class withdrawal extends Thread{
    static int totalbalance =1000;
    int amount;
    public withdrawal(int amount){
        this.amount=amount;
    }
    public  synchronized void run(){
        synchronized (withdrawal.class)
{
    {
        if(totalbalance>=amount)
          { System.out.println("debited amount: "+amount);
            try{Thread.sleep(1000);
            }catch(InterruptedException e){
            }
            totalbalance=totalbalance-amount;
            System.out.println("balance left: "+totalbalance);
            
          }
          else
          System.out.println("insufficient balance");
    }
}
   
    }
}
public class demo{
    public static void main(String[] args) {
        withdrawal t1=new withdrawal(800);
        withdrawal t2=new withdrawal(800);
        t1.start();
        t2.start();
    }
}