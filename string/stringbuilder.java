package string;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        str.append("hii");  
        System.out.println(str.length());
        System.out.println(str.capacity());
        System.out.println(str);     
    }
    
}
