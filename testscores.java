//oman ijaz
//Lab 4 task 4
import java.util.Scanner;
public class testscores
{
   public static void main(String[] args)
   {
       Scanner input=new Scanner(System.in);
       int Test1,Test2,Test3;
       double averagescore;
       
   System.out.print("Enter the score of Test1:");
   Test1=input.nextInt();
   System.out.print("Enter the score of Test2:");
   Test2=input.nextInt();
   System.out.print("Enter the score of Test3:");
   Test3=input.nextInt();
  
   averagescore= (Test1+Test2+Test3)/3.0;
   System.out.println("The average score of 3 tests is " +averagescore);

   if(averagescore>=90)
   {
   System.out.println("Your grade is A");
   }
   else if(averagescore>=80)
   {
   System.out.println("Your grade is B");
   }
   else if(averagescore>=70)
   {
   System.out.println("Your grade is C");
   }
   else if(averagescore>=60)
   {
   System.out.println("Your grade is D");
   }
   else if(averagescore<60)
   {
   System.out.println("Your grade is F");
   }
   }
}