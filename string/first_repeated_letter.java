package string;

public class first_repeated_letter {
    public static void main(String[] args) {
        String str="hhelololo";
       int count=0;
        char arr[]=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.print(arr[i]);
                    count++;
                    break;
                }
            }
            if (count!=0)
            break;
        }
    }
    
}
