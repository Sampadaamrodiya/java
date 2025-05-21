interface Client{
    void print();
    void show();

}
class developer implements Client{
    public void print()
    {System.out.println("bill");}
    public void show(){
    System.out.println("biryani");}

}

public class newInterface {
    public static void main(String[] args) {
        developer obj=new developer();
        obj.print();
        obj.show();

    }

    
}
