import java.util.*;
public class Grade {
    public static void main(String[] args)
    {
        Calculate();

        System.out.println("Do you want to continue(yes/no)::");
        Scanner sc = new Scanner(System.in);
        String ans = sc.next().toLowerCase();
        while(ans.equals("yes"))
        {
            Calculate();
        }
    }


    public static void Calculate()
    {
        System.out.println("Grade Calculator::");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks for Maths::");
        int Maths=sc.nextInt();
        System.out.println("Enter marks for Python::");
        int Python=sc.nextInt();
        System.out.println("Enter marks for C::");
        int C=sc.nextInt();
        System.out.println("Enter marks for MySql::");
        int MySql=sc.nextInt();
        System.out.println("Enter marks for Java::");
        int Java =sc.nextInt();

        int Total=Maths+Python+C+MySql+Java;
        int average=Total/5;
        System.out.println("Your Average mark is::"+average);

        if(average>=90)
        {
            System.out.println("Your Grade is :: A");
        }
        else if (average>=75)
        {
            System.out.println("Your Grade is :: B");
        }
        else if (average>=65)
        {
            System.out.println("Your Grade is :: C");
        }
        else if (average>=45)
        {
            System.out.println("Your Grade is :: D");
        }
        else
        {
            System.out.println("You are fail");
        }
    }


}

