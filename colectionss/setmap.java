import java.util.HashMap;
public class setmap {
    public static void main(String[] args) {
        // HashMap<String,Integer> map= new HashMap<>();
        // map.put("id0",1);
        // map.put("id1",2);
        // map.put("id2",3);

        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(1,11);
        map.put(2,20);
        map.put(3,300);
        //System.out.println(map);
        // System.out.println(map.get("ikk"));
        // System.out.println(map.get("id0"));
        // System.out.println(map.containsKey("id0"));
        // map.remove("id0");
        System.out.println(map);
       // for (Integer key:map.keySet())
       //for(Integer key:map.values())
       map.forEach((key,value)->
        {    System.out.println(key+" "+value);
            if(key>2)
            System.out.println(value+" ");
            });

        
    }
    
}
