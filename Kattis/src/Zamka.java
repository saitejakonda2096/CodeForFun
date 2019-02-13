import java.util.*;

// Programmer: Saiteja Konda
// Date : 2/2/19

public class Zamka
{
    public static void main(String args[])
    {
      int l,d,x,min,max;
      Scanner sc = new Scanner(System.in);
      l=sc.nextInt();
      d=sc.nextInt();
      x=sc.nextInt();
      max=0;
      min=0;
      for(int i=l;i<=d;i++)
      {
          if(sumOfDigits(i,x)==x)
          {
              if(min==0)
              {
                  min = i;
                  max=i;
              }
              else
                  max=i;
          }
      }
      System.out.println(min+"\n"+max);
    }
    public static int sumOfDigits(int i,int x)
    {
        int sum;
        if(i/10==0)
            sum=i;
        else
            {
                sum=0;
            while (i != 0 && sum<=x) {
                sum += i % 10;
                i = i / 10;
            }
        }
        return sum;
    }
}
