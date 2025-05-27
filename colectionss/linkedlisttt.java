import java.util.*;
class linkedlisttt{
    public static void main(String[] args) {
        LinkedList<Integer> arr= new LinkedList<>();
        long start =System.nanoTime();
        arr.add(2);
        System.out.println((arr.contains(2)));
        long end =System.nanoTime();
        System.out.println(end-start);

    }
}