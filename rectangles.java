//oman ijaz
//Lab 4 task 3
import java.util.Scanner;
class rectangles
{
   public static void main(String[] args)
   {
       Scanner input=new Scanner(System.in);
       int length1, width1;
       int length2, width2;
         
       int Area1, Area2;
      
   System.out.println("Rectangle 1:");
       System.out.print("Enter Length of rectangle 1:");
       length1=input.nextInt();
       System.out.print("Enter Width of rectangle 1:");
       width1=input.nextInt();
      
       Area1= length1*width1;
      
   System.out.println("Rectangle 2:");
       System.out.print("Enter Length of rectangle 2:");
       length2=input.nextInt();
       System.out.print("Enter Width of rectangle 2");
       width2=input.nextInt();
      
       Area2= length2*width2;
      
       if(Area1>Area2)
       {
       System.out.println("Rectangle 1 has a greater area than Rectangle 2");
       }
       else if(Area1<Area2)
       {
       System.out.println("Rectangle 2 has a greater area than Rectangle 1");
       }
       else if(Area1==Area2)
       {
       System.out.println("Both the Rectangle's have the same area");
       }
   }
}  