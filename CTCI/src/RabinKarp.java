//Programmer: Saiteja Konda
//CTCI page no:636
//Date: 2/10/19
//Purpose: To implement Rabin Karp Algorithm
import java.util.*;

public class RabinKarp
{
    public static void main(String args[])
    {
        int stack_len,hay_len;
        String needle,hayStack,result;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the hayStack\n");
        hayStack = new String(scan.nextLine());
        System.out.print("Please enter the needle\n");
        needle = new String(scan.nextLine());
        hay_len=needle.length();
        stack_len=hayStack.length();
        result="Hay not found in Stack";
        if(hay_len==0 || stack_len==0)
            result="Wrong Input";
        else if(hay_len<stack_len)
            result=hayStack(hayStack,needle,stack_len,hay_len);
        else if(hay_len==stack_len)
        {
            if(needle.equals(hayStack))
                result="Needle found at position 0 in the HayStack.";
        }
        else
            result="Needle length is greater than hayStack!!";
        System.out.print(result);
    }

    public static String hayStack(String stack, String hay,int stack_len,int hay_len)
    {
        int firstChar;
        int hayCode,stack_code;

        hayCode = code(hay.toCharArray());
        stack_code=code((stack.substring(0,hay_len)).toCharArray());
        firstChar=stack.charAt(0);

        for(int i=0;i<=stack_len-hay_len;i++)
        {
            if(i!=0)
            {
                stack_code-=(int)Math.pow(10,hay_len-1)*firstChar;
                stack_code*=10;
                stack_code+=stack.charAt(i+hay_len-1);
            }
            firstChar=stack.charAt(i);
            if(stack_code==hayCode)
            {
                return "Needle found at position "+(i+1)+" in the HayStack.";
            }
        }
        return "Needle not found in HayStack";
    }
    public static int code(char arr[])
    {
        int arr_len=arr.length;
        int code=0;
        for(int i=0;i<arr_len;i++)
        {
            code+=arr[i]*(Math.pow(10,arr_len-i-1));
        }
        return code;
    }
}
