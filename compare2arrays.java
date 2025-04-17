import java.util.Scanner;

public class compare2arrays {
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
    

        boolean isEqual = java.util.Arrays.equals(arr1, arr2);
        if (isEqual) {
         System.out.println("Arrays are equal");
        } else {
         System.out.println("Arrays are not equal");
        }

    }
}
