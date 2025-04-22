package pattern;
public class pattern {

    public static void main(String[] args) 
    {
        //upper right triangle
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {System.out.print("*");}
            System.out.println();
        }

        System.out.println();
        
        //lower left triangle
        for (int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            System.out.print("*");
            System.out.println();
        }System.out.println();
         
        //lower right triangle
        for(int i=1;i<=5;i++)
        {   for(int j=1;j<i;j++)
            {  System.out.print(" ");
            }

            for(int k=i;k<=5;k++)
            {   System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();

        //pyramid
        for(int i=1;i<=5;i++)
        {
            for(int k=5;k>i;k--)
            {   System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {  System.out.print("*");
            }

            for(int k=1;k<i;k++)
            {   System.out.print("*");
            }
            System.out.println();
        }
    
    System.out.println();
    //inverted pyramid
    for(int i=1;i<=5;i++)
    {  
        for(int k=1;k<i;k++)
        System.out.print(" ");
         
        for(int l=5;l>i;l--)
        System.out.print("*");
        for(int j=5;j>=i;j--)
        System.out.print("*");


        System.out.println();
    }

    System.out.println();
    System.out.println();

    //Alphabet printing
    for(int i=1;i<=5;i++)
    {    char a=65;
        for(int j=1;j<=i;j++)
        {
            System.out.print(a);
            a++;
        }
            System.out.println();
        
    }
    System.out.println();
    
    for (int i=0;i<5;i++)
    {
        char a=65;
        for(int j=5;j>i;j--)
        System.out.print(" ");
        for(int k=0;k<i;k++)
        {System.out.print(a);
        a++;}
        System.out.println();
    }

    
    
}
}

//palindrome number 123
//prime number 1 to 20
