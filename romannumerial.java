//oman ijaz
//Lab 4 task 2
import java.util.Scanner;
public class romannumerial
{
   public static void main(String[] args)
   {
       Scanner input=new Scanner(System.in);
       int x;
      
   System.out.print("Enter a Number in range 1 to 5:");
   x=input.nextInt();
  
   if(x==1)
   {
   System.out.println("Roman Numeral of 1 is 'I'");
   }
   else if(x==2)
   {
   System.out.println("Roman Numeral of 2 is 'II'");
   }
   else if(x==3)
   {
   System.out.println("Roman Numeral of 3 is 'III'");
   }
   else if(x==4)
   {
   System.out.println("Roman Numeral of 4 is 'IV'");
   }
   else if(x==5)
   {
   System.out.println("Roman Numeral of 5 is 'V'");
   }
   
   else
   {
     System.out.println("Invalid input please try agin");
   }
   }
}
