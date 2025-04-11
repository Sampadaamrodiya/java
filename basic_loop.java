class basic_loop{
    public static void main(String[] args) {
        System.out.println("for loop ");
        for (int i=1;i<=10;i++)
        {
            System.out.println(i);
        }
        System.out.println("while loop");
        int a=1;
        while(a<=10)
        { System.out.println(a);
            a++;
        }

        System.out.println("\n\npattern printing\n");
        for (int i=0;i<5;i++)
        {
            for (int j=0;j<=i;j++)
            {System.out.print("*");}
            System.out.println();
        }
        
    }
}