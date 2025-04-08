// class class_demo
// {
//     public static void main(String[] args) 
//     {
//             class_demo obj=new class_demo();
//             obj.show();
//             obj.add(10,20);

//     }
//     public void show()
//     {
//        System.out.println("show function call");
//     }
//     public void add(int a,int b)
//     {
//         System.out.println(a+b);
//     }
// }

class class_demo
{
    public class_demo()
    {
        System.out.println("Constructor");
    }
    public static void main(String[] args) {
        class_demo obj = new class_demo();
    }
}
