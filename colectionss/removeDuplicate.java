import java.util.*;
public class removeDuplicate {
    public static void main(String[] args) {
        int arr[]={1,2,2,42,4,5,3,53,45,3,5};
        int count=0,repeat=0;
        
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(set.contains(arr[i]) && count==0)
           { System.out.println("first repeated elment: "+arr[i]);
             count++;
           }  

           if(set.contains(arr[i]))
           repeat++;

           set.add(arr[i]);

        }
        System.out.println("hashSet: "+set);
        System.out.println("repeated numbers: "+repeat);

      
        

        TreeSet<Integer> tree= new TreeSet<>();
        for(int i=0;i<arr.length;i++)
        {
            tree.add(arr[i]);
        }
        System.out.println("TreeSet: "+tree);
        
    }
}
