//oman ijaz
import java.util.*;
public class pickNumber
{
  public static void main (String[]args)
  {
    System.out.println("Pick a number 1 to 10");
    Scanner keyboard = new Scanner(System.in);
    
    int inputNum = keyboard.nextInt();
    if (inputNum <= 0)
    {
     System.out.println("Error: Number must be between 1 to 10 "); 
    }
    else if (inputNum < 5)
    {
     System.out.println("Bad job "); 
    }
    else if (inputNum > 10)
    {
     System.out.println("Error: Number must be between 1 to 10 "); 
    }
    else
    {
     System.out.println("Good job "); 
    }
  }  
}    