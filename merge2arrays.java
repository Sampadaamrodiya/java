import java.util.Scanner;

public class merge2arrays {
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
        int[] merged = new int[arr1.length + arr2.length];
        
    for (int i = 0; i < arr1.length; i++) {
     merged[i] = arr1[i];
    }
    for (int i = 0; i < arr2.length; i++) {
     merged[arr1.length + i] = arr2[i];
    }

    System.out.print("Merged array: ");
    for (int val : merged) 
    { System.out.print(val + " ");
    }    
    }
}
