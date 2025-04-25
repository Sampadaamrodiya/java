package method;

public class variable {
    //instance variable
    int a=5;
    //statc variable
    static int b=10;
    public static void main(String[] args) 
    {   //local variable
        int c=15;

        // accessing instant variable
        variable object = new variable();
        System.out.println("instance variable: "+object.a);

        //accessing static variable
        System.out.println("static variable: "+b);

        //acessing local variable
        System.out.println("local variable: "+c);
    }
    
}
