package array;
import java.util.Scanner;
public class sumOf2Array {
    public static void main(String[] args) {
        System.out.println("enter size of array ");
        Scanner elements = new Scanner(System.in);
        int n= elements.nextInt();
        int arr1[]= new int[n];
        int arr2[]=new int[n];

        System.out.println("enter elements of Array 1: ");
        for(int i=0;i<n;i++)
        {
            arr1[i]=elements.nextInt();
        }
        System.out.println("enter elements of Array 2: ");
        for(int i=0;i<n;i++)
        {
            arr2[i]=elements.nextInt();
        }
    
    
    int sum[]=new int[n];
    for(int i=0;i<n;i++)
    {
        sum[i]=arr1[i]+arr2[i];
    }
    System.out.println("sumof array ");
    for(int val:sum)
    {
        System.out.print(val+"  ");
    }
    }

}
