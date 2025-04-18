import java.util.Scanner;

public class commonElements {
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
        System.out.print("Common elements: ");
        for (int i = 0; i < arr1.length; i++) {
         for (int j = 0; j < arr2.length; j++) {
         if (arr1[i] == arr2[j]) {
         System.out.print(arr1[i] + " ");
         break;
         }
         }
        }
}
}
