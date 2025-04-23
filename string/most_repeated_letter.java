package string;

public class most_repeated_letter {
    public static void main(String[] args) {
        String str="hhhhelllooooooooo";
       
        char max='\0';
        int max_count=0;
       
        char arr[]=str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {   int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if (max_count<count)
            {
                max_count=count;
                max=arr[i];
            }
        }
        System.out.println(max);

    }
    
}
