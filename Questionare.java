//oman ijaz
import java.util.*;
public class Questionare 
{
public static void main (String[]args)
 {
  Scanner keyboard = new Scanner(System.in);
  
  String question = "Which car brand is the most reliant?";
  String choiceOne = "Mercedes";
  String choiceTwo = "Toyota";
  String choiceThree = "BMW"; 
  String correctAnswer = choiceTwo;
 
  
  System.out.println(question);
  System.out.println(choiceOne + ", " + choiceTwo + " or "  + choiceThree);
  String input = keyboard.next();
  
  if (correctAnswer.equals(input))
  {
    System.out.println("Correct answer");
  }
  else
  {
    System.out.println("Incorrect answer!, it was Toyota");
  }
  
 }
}