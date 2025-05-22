package basic;
import java.util.Scanner;
public class exception_handling {
    public static void main(String[] args) {
        
        // Scanner obj= new Scanner(System.in);
        // int a=obj.nextInt(); int b=obj.nextInt();
        // try{
        //     int c=a/b;
        //     System.out.println(c);
        // } catch (Exception e){
        //     System.out.println("cannot divide by zero");
        // }


        int array[]={1,2,3,4,4};
        try{
            System.out.println(array[7]);
        }catch(Exception e){
            System.out.println(e);        
        }finally{
            //koi chale ya na chale ye hamesha chelga
            System.out.println("process completed");
        }

        




       
    }
    
}
