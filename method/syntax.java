package method;

public class syntax {
    static void print()
    {
        System.out.println("with static");
    }
    void printnew()
    {
        System.out.println("without static");
    }
    public static void main(String[] args) {
        //static method call
        print();
        //non static method call
        syntax object= new syntax();
        object.printnew();
    }
    
}
