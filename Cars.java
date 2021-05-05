//oman ijaz
import java.util.*;
public class Cars 
{
public static void main (String[]args)
{
  Scanner keyboard = new Scanner(System.in);
  boolean question = true;
  while (question)
   {
    System.out.println("Which car brand is the most reliant?");
    System.out.println("Mercedes, Toyota or BMW? ");
    String userInput = keyboard.next();
    
    if(userInput.equals("Toyota"))
    {
      question = false; 
      System.out.println("Correct, you are smarter then I thought");
    }
    else 
    {
     System.out.println("Incorrect, try again"); 
    }
  }
 }
}