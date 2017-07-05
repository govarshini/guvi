import java.io.*;
import java.util.*;
class coun
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        int count=0,r;
        while(n>0)
        {
            r=n%10;
            count++;
            n=n/10;
        }
        System.out.print(count);
    }
}
