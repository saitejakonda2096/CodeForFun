import java.util.*;
public class HayStack
{
    public static void main(String args[])
    {
        StringBuilder hay,stack;
        String temp;
        int hay_code,hay_len,stack_len;
        Scanner scan = new Scanner(System.in);
        stack = new StringBuilder(scan.nextLine());
        hay = new StringBuilder(scan.nextLine());
        hay_code=hay.hashCode();
        hay_len=hay.length();
        stack_len=stack.length();
        for(int i=0;i<(stack_len-hay_len);i++)
        {
            temp=stack.substring(i,i+hay_len);
            System.out.print(temp.hashCode()+" "+hay_code);
            if(temp.hashCode()==hay_code)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
