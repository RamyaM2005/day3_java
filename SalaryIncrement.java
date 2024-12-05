import java.util.*;
public class SalaryIncrement
{
    public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int pp=sc.nextInt();
        int y=sc.nextInt();
        double salary=sc.nextDouble();
        if (pp>=5 && y>=10 && salary==50000) 
        {
            double increment=salary*0.10;
            System.out.println(name+" is eligible for 10% increment.");
            System.out.println("New salary: "+(salary+increment));
        }
        else if ((pp>=3 && pp<5) && (y>=5 && y<10) && (salary<=30000 && salary<50000))
        {
            double increment=salary*0.8;
            System.out.println(name+" is eligible for 8% increment.");
            System.out.println("New salary: " + (salary+increment));
        }
        else if ((pp>=1 && pp<3) && (y>=1 && y<5) && salary<=30000) 
        {
            double increment=salary*0.6;
            System.out.println(name+" is eligible for a 6% increment.");
            System.out.println("New salary: "+(salary+increment));
        }
        else 
        {
            System.out.println(name+" is not eligible for increment");
        }
        sc.close();
    }
}