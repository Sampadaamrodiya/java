package array;
import java.util.Scanner;
public class sumOfArray {
   

 public static void main(String[] args) {
 Scanner element = new Scanner(System.in);
 System.out.print("Enter size of array: ");
 int n = element.nextInt();
 int[] arr = new int[n];
 int sum = 0;

 System.out.println("Enter elements:");
 for (int i = 0; i < n; i++) {
 arr[i] = element.nextInt();
 sum += arr[i];
 }
 System.out.println("Sum = " + sum);
 }
}

