package method;

public class maxPair {
    static void Max(int array[])
    {
        int max=Integer.MIN_VALUE;
        int sum=0;
        int num1=0;
        int num2=0;
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                sum=array[i]+array[j];
                if(sum>=max)
                { 
                    num1=array[i];
                    num2=array[2];  
                }
            }
        }
        System.out.print("Pair having maximum sum: ("+num1+","+num2+")");
    }
        
    public static void main(String[] args) {
        int array[]={2,3,6,1,5,8,0};
        System.out.print("elemnts of array: ");
        for(int val:array)
        System.out.print(val+" ");
        System.out.println();
        
        Max(array);
    }
    
}