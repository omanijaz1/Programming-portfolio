//oman ijaz
import java.util.*;
public class IntSearching
{
  public static void main (String[]args)
  {
    Scanner keyboard = new Scanner(System.in);
    int [] data = new int[5];
    System.out.println("Enter your five numbers");
    for (int i = 0; i < 5; i++)
    data [i] = keyboard.nextInt();
    array(data);
  } 
  public static void array(int[] data)
  {
     System.out.println("Unsorted array" + Arrays.toString(data));
    Arrays.sort(data);
    System.out.println("Sorted array" + Arrays.toString(data)); 
    System.out.println("Min is " + data[0]);
    System.out.println("Max is " + data[4]);
  } 
}  

// This code can be used to when asking a user multiple numbers and it will assort them appropriately