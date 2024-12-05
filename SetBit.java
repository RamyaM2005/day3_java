import java.util.*;
public class SetBit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pos=sc.nextInt();
        if((n&(1<<pos))!=0)
        {
            System.out.println("Set Bit");
        }
        else
        {
            System.out.println("Not a Set Bit");
        }
        sc.close();
    }
}