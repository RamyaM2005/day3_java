import java.util.*;
public class Power0fTwo 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();;
        if((a&(a-1))==0)
        {
        System.out.println("Power of 2");
        }
        else
        {
        System.out.println("Not a Power of 2");
        }
        sc.close();
    }    
}