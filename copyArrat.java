import java.util.Scanner;

public class copyArrat {
  public static void main(String[] args)
  {

     System.out.println("enter size of array ");
        Scanner elements = new Scanner(System.in);
        int n= elements.nextInt();
        int arr1[]= new int[n];
        

        System.out.println("enter elements of Array : ");
        for(int i=0;i<n;i++)
        {
            arr1[i]=elements.nextInt();
        }

    int[] arr2 = new int[arr1.length];
    for (int i = 0; i < arr1.length; i++) 
    {
     arr2[i] = arr1[i];
    }
    System.out.print("Copied array: ");
    for (int val : arr2)
     {
     System.out.print(val + " ");
     }

 }
}
