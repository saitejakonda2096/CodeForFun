//Programmer: Saiteja
//CTCI page no:90
//Problem:1.1
//Date: 2/10/19
//Purpose: To check whether the given string has unique characters or not
import java.util.*;
public class IsUnique
{
    public static void main(String args[])
    {
     int array[] = new int[128];
     int input_len;
     String input;
     Scanner scan = new Scanner(System.in);
     input=new String(scan.nextLine());
     input_len=input.length();
     if(input_len>128)
         System.out.print("Has Duplicate");
     else
     {
         for(int i=0;i<input_len;i++)
         {
             int position = input.charAt(i);
             if(array[position]==0)
                 array[position]=1;
             else
             {
                 System.out.print("Has Duplicate");
                 break;
             }
         }
     }
  }
}
