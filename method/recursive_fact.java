package method;

public class recursive_fact {
    static int fact(int num)
    {
        if(num==0)
        return 1;
        else
        return num*fact(num-1);
    }   
    public static void main(String[] args) {
        
        int result=fact(5);
        System.out.println("factorial: "+result);
    } 
}
