import java.util.*;
public class NestedIf 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a<b)
        {
            if(a<c)
            {
                System.out.println("a is smaller");
            }
            else 
            {
                System.out.println("c is smaller");
            }
        }
        else if(b<c)
        {
            System.out.println("b is smaller");
        }
        else 
        {
            System.out.println("c is smaller");
        }
    }
}