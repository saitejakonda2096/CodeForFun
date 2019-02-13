import java.util.*;

public class Filip
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        StringBuilder digit1 = new StringBuilder();
        digit1.append(scan.next());
        StringBuilder digit2 = new StringBuilder();
        digit2.append(scan.nextInt());
        int winner;

        if(Integer.parseInt(digit1.reverse().toString()) > Integer.parseInt(digit2.reverse().toString()))
        {
            System.out.print(digit1);
        }
        else
        {
            System.out.print(digit2);
        }
    }
}
