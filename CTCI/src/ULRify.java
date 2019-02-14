//Programmer: Saiteja
//CTCI page no:90
//Problem:1.3
//Date: 2/14/19
//Purpose: To replace all the spaces in a given string with %20
import java.util.*;
public class ULRify
{
    public static void main(String args[])
    {
        int reqLength,inputLen;
        System.out.print("Enter the input string to replace blank spaces with the string %20 ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        inputLen = input.length();
        reqLength=inputLen;
        if(inputLen!=0)
        {
            for (int i = 0; i < inputLen; i++)
            {
                if (input.charAt(i) == ' ')
                    reqLength += 2;
            }
            System.out.println(ulrify(input,reqLength));
        }
        else
            System.out.print("Invalid Input");
    }
    public static String ulrify(String input,int reqLength)
    {
        char output[]= new char[reqLength];
            int j=0;
            for(int i=0;i<input.length();i++)
            {
                if(input.charAt(i)==' ')
                {
                    output[j] = '%';
                    output[j + 1] = '2';
                    output[j + 2] = '0';
                    j+=3;
                }
                else
                {
                    output[j]=input.charAt(i);
                    j++;
                }
            }
        return String.valueOf(output);
    }
}
