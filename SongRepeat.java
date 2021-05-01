//oman ijaz
import java.util.*;
public class SongRepeat 
{
public static void main (String[]args)
{
  Scanner keyboard = new Scanner(System.in);
  boolean playSong = true;
  while (playSong)
  {
    System.out.println("play next song?");
    System.out.println("if so answer yes");
    String userInput = keyboard.next();
    
    if(userInput.equals("yes"))
    {
      playSong = false;
    }
    System.out.println(" play next song");
  }
}
}