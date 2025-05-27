import java.util.*;
public class hashhset {
    public static void main(String[] args) {
        HashSet <String> set= new HashSet<>();
        //removes repeated vales and,unordered:elements are not stored in the order you store them
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("B");
        set.add("a");
        set.add("b");
        set.add("K");
        set.add("e");
        System.out.println(set);

        TreeSet<String> tree =new TreeSet<>();
        tree.add("A");
        tree.add("B");
        tree.add("C");
        tree.add("B");
        tree.add("a");
        tree.add("b");
        tree.add("K");
        tree.add("e");
        System.out.println(tree);
        tree.clear();
        //stores element in sorted asscending order and no duplicates allowed
        tree.add("E");
        tree.add("A");
        tree.add("B");
        tree.add("A");
        tree.add("c");
        System.out.println((tree));

    }
    
}
