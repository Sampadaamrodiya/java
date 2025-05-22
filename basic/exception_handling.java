package basic;
import java.util.Scanner;
public class exception_handling {
    public static void main(String[] args) {
        
        Scanner obj= new Scanner(System.in);
        int a=obj.nextInt(); int b=obj.nextInt();
        try{
            int c=a/b;
            System.out.println(c);
        } catch (Exception e){
            System.out.println("cannot divide by zero");
        }


        int array[]={1,2,3,4,4};
        try{
            System.out.println(array[7]);
        }catch(Exception e){
            //we can use multiple catch block for diff exceptions
            System.out.println(e);        
        }finally{
            //koi chale ya na chale ye hamesha chelga
            System.out.println("process completed");
        }

 
        // Scanner obj=new Scanner(System.in);
        // System.out.print("enter size of array: ");
        // int size=obj.nextInt();
        // int array[]=new int[size];
        // for (int l=0;l<size;l++)
        // array[l]=obj.nextInt();
        // int subarr[]=new int[3];
        // try{int i,j,k=0,sum=0;
        //     for( i=0;i<array.length-3;i++)
        //     {int newsum=array[i]+array[i+1]+array[i+2];
            
        //         if(sum<newsum)
        //         {sum=newsum;
        //           subarr[0]=array[i];
        //           subarr[1]=array[i+1];
        //           subarr[2]=array[i+2];

        //         }
        //     }
            
        //     for(int val:subarr)
        //     System.out.println(val);
        // }
        
        // catch(Exception e){
        //     System.err.println(e);
        // }

       
    }
    
}
