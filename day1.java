public class day1 {
    public static void main(String[] args) {
        //print hello world
        System.out.println("Hello, World!\n");

        //declare and print datatypes
        byte a=10;
        short b=20;
        int c=30;
        long d=40;
        float e=3.14f;
        double f=44;
        char g='a';
        boolean h=true;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h+"\n");

        //convert an int to float and print both
        int x=20;
        float y=(float)x;
        System.out.println(x);
        System.out.println(y+"\n");
        
            
        //convert a double to int and print
        double p=3.134564;
        int q=(int)p;
        System.out.println(p);
        System.out.println(q+"\n");

        //swap two numbers using temp variable
        int i=10;
        int j=20;
        int k=j;
        j=i;
        i=k;

        //swap two numbers without using temp variable
        int num=10;
        int num2=20;
        num=num+num2;
        num2=num-num2;
        num=num-num2;
        System.out.println(num);
        System.out.println(num2+"\n");

        //predict output
        int num3=5;
        double num4=10;
        System.out.println(num3+num4+"\n");

        //declare 2 int 2 float  now add all 4 and print
        int num5=5;
        int num6=6;
        float num7=7;
        float num8=8;
        float res=num5+num6+num7+num8;
        System.out.println(res);




    }
    
}
