public class prime {
    public static void main(String[] args) {
        int num=11;
        boolean isprime=true;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
           { isprime=false;
            break;}
        }
        if(isprime)
        System.out.println("prime number");
        else
        System.out.println("not prime");
    }
}
