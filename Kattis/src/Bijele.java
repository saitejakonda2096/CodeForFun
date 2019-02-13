
//Programmer : Saiteja Konda
//Date: 2/2/19

import java.util.*;
public class Bijele
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder("");
        int[] need = {1,1,2,2,2,8};
        int[] have = new int[6];
        for(int i=0;i<6;i++)
        {
            have[i]= sc.nextInt();
            result.append(need[i]-have[i]);
            result.append(" ");
        }
        System.out.println(result);
    }
}