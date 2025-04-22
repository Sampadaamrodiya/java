package string;
class string_new{
    public static void main(String[] args) {
        //sum of digits
        int num=123;
        int sum=0;
        while(num!=0)
        {
            sum=sum+(num%10);
            num= num/10;
        }
        System.out.println(sum);

        //even odd
        num=123;
        while(num!=0)
        {
            int digit=num%10;
            if(digit%2==0)
            System.out.println(digit+" is even");
            else
            System.out.println(digit+" is odd");
            num/=10;
        }

        //check prime numbers in array
        int arr[]={1,2,3,3,4,56,67,7,8,9};
        System.out.println("prime numbers");
        for(int var:arr)
        {   boolean isprime=true;
            for(int i=2;i<var/2;i++)
           { if(var%i==0)
             isprime=false;
           }
           if(isprime)
           System.err.print(var+"  ");

        }
       System.out.println();
        

       //count common alphabet
       String str1="hello";
       String str2="hiiii";
       int count=0;
       

        //pallindrome
        String palindrome="racecar";
        int j=palindrome.length()-1;

        boolean ispalindrome=true;
        for(int i=0;i<palindrome.length();i++)
        {   
            if(palindrome.charAt(i)!=palindrome.charAt(j))
            {ispalindrome=false;
            break;}
            j--;

        }
        if(ispalindrome)
        System.out.println(" is palindrome");
        else
        System.out.println("not palindrome");
        

        //target r     convert into array
        palindrome="racer";
        char array[]=palindrome.toCharArray();
        count=0;
        for(int var:array)
        {
            if(var=='r')
            count++;
        }
        System.out.println(count+" r's present");

        //count vowels
        String alphabet="racercarjhfgahaha";
        char arr1[]=alphabet.toCharArray();
        count=0;
        for(int var:arr1)
        {if(var=='a'||var=='e'||var=='i'||var=='o'||var=='u')
        count++;
        }
        System.out.println("vowels count: "+count);

        //repeat alphabet remove  duplicacy
    // String str3="hello";
    // char arr2[]=str3.toCharArray();
    // char arr3[]= new char[60];
    // int i=0;
    // while(str3.charAt(i)!='\0')
    // {   int j=0;
    //     if(arr[j]=='\0')
    //     arr[j]=arr2[i];


    // }

    }
}