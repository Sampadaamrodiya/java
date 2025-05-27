package colectionss;
import java.util.ArrayList;
import java.util.Collections;
public class collextions {
    public static void main(String[] args) {
        ArrayList<String> arr= new ArrayList<>();
        arr.add("rahul");
        arr.add("rohit");
        arr.add("ram");
        arr.add("ritik");
        System.out.println(arr);
        arr.add(0,"first");
        System.out.println(arr);
        arr.add(2,"third");
        System.out.println(arr);
        arr.remove(3);
        System.out.println(arr);
        System.out.println(arr.get(1));
        System.out.println(arr.size());
        System.out.println(arr.isEmpty());
        arr.set(1,"hii");//it replaces
        System.out.println(arr);
        arr.clear();
        System.out.println(arr.isEmpty());


        //using loop
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =1;i<11;i++)
        {
            list.add(i*2);
        }
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println(list);

        //using collection.sort
        ArrayList<String> collection=new ArrayList<>();
        collection.add("e");
        collection.add("a");
        collection.add("d");
        collection.add("c");
        Collections.sort(collection);
        System.out.println(collection);
        

    }

    
}
