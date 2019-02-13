//Programmer: Saiteja Konda
//CTCI page no:90
//Problem: 1.2
//Date: 2/10/19
//Purpose: To check whether the given strings are permutations of each other or not

import java.util.Scanner;

public class CheckPermutation
{
    public static void main(String args[])
    {
        int input1_len,input2_len;
        String input1,input2,result;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the First String: \n");
        input1=scan.nextLine();
        System.out.print("Enter the Second String: \n");
        input2=scan.nextLine();

        input1_len=input1.length();
        input2_len=input2.length();

        if(input1_len==input2_len)
        {
            if(input1.equals(input2))
                result="The given strings are permutations of each other!!";
            else
                result=permutationChecker(input1,input2,input1_len);
        }
        else
            result="The given strings are not permutations of each other!!";
        System.out.println(result);
    }

    public static String permutationChecker(String s1,String s2,int len)
    {
        int arr[] = new int[128];
        for(int i=0;i<len;i++)
        {
            arr[s1.charAt(i)]++;
        }
        for(int i=0;i<len;i++)
        {
            arr[s2.charAt(i)]-=1;
            if (arr[s2.charAt(i)]<0)
                return "The given strings are not permutations of each other!!";
        }
        return "The given strings are permutations of each other!!";
    }
}
