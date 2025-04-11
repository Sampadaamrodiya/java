import java.util.Scanner;

public class vowel_consonant {
    public static void main(String[] args) {
        System.out.println("enter a character: ");
       Scanner object = new Scanner(System.in);
        char ch= object.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        System.out.println("vowel");
        else
        System.out.println("consonant");
    }
}
