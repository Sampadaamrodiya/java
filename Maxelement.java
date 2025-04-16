import java.util.Scanner;
public class Maxelement {
 public static void main(String[] args) {
 Scanner element = new Scanner(System.in);
 System.out.print("Enter size of array: ");
 int n = element.nextInt();
 int[] arr = new int[n];

 System.out.println("Enter elements:");
 for (int i = 0; i < n; i++) {
 arr[i] = element.nextInt();
 }

 int max = arr[0];
 for (int i = 1; i < n; i++) {
 if (arr[i] > max) {
 max = arr[i];
 }
 }
 System.out.println("Maximum element: " + max);
 }
}