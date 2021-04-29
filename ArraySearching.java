//oman ijaz
import java.util.*;
public class ArraySearching
{
  public static void main (String[]args)
  {
    Scanner keyboard = new Scanner(System.in);
    int [] nums = {10, 89,50, 24, 60, 1, 15};
    System.out.println("Enter the number you are looking for");
    int x = keyboard.nextInt();
    boolean found = false;
    for (int i = 0; i < nums.length; i++)
    {
      if (nums[i] == x)
        found = true;
    }  
      if (found)
        System.out.println("Number found at position x");
      else 
        System.out.println("Number not found in array");
    }
  }