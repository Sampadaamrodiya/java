package method;

public class missingNumber {
    static int findMissing(int array[])
    {
        int length=array.length;
        int sum=(length+1) * ((length+1+1)/2);
        int arraysum=0;
        for(int var:array)
        {
            arraysum+=var;
        }
        return (sum-arraysum);
    }
    public static void main(String[] args) {
        int array[]={1,2,3,5};
        System.out.println(findMissing(array));
    }
    
}
