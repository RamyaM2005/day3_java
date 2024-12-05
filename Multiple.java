import java.util.*;
public class Multiple
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n&3)==0)
        {
        System.out.println("Multiple of 4");
        }
        else
        {
        System.out.println("Not a Multiple of 4");
        }
    }    
}