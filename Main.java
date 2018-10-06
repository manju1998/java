import java.util.*;
 
class Main
{
    public static void main(String []s)
    {
        int num1;
        //Scanner class to read value
        Scanner sc=new Scanner(System.in);
         
        
        num=sc.nextInt();
         
        //check condition for +ve, -ve and Zero
        if(num1>0)
            System.out.println(num1 + " is POSITIVE NUMBER.");
        else if(num1<0)
            System.out.println(num1 + " is NEGATIVE NUMBER.");
        else
            System.out.println("IT's ZERO.");
         
    }
}
