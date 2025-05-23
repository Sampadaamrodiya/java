package array;
import java.util.ArrayList;


public class sum {
    public static void main(String[] args) {
        int sum=0;
        int currentsum=0;
        ArrayList <Integer> array =new ArrayList<>();
        array.add(2);
        array.add(-7);
        array.add(0);
        array.add(5);
        array.add(6);
        array.add(-3);
        array.add(0);
        array.add(1);
        System.out.println(array);
        for(int i=0;i<array.size();i++)
        {
            sum=sum+array.get(i);
            if(currentsum<sum)
            {
               currentsum=sum;
            }
            else
            {
                sum=sum-array.get(i);
                array.remove(i);
            }
        }
        System.out.println(currentsum);
        System.out.println(array);


    }
    
}
