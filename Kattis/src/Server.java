
//Programmer: Saiteja KOnda
// Date: 2/9/18

import java.util.*;

public class Server {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int tasks, time,count=0;
        tasks = scan.nextInt();
        time = scan.nextInt();
        for(int i=0;i<tasks;i++)
        {

            time-=scan.nextInt();
            if(time>=0)
                count++;
            else
                break;
        }
        System.out.print(count);
    }
}
