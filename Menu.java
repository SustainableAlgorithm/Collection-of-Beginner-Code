// Kathleen Kagan
// ACO 101 - Tibbetts

import java.util.ArrayList;
import java.util.Scanner;

/**
A menu that is displayed on a console
**/
public class Menu
{
   private ArrayList<String> options;
   private Scanner in;
   
   /**
   Construct a menu with no options
   */
   
  public Menu()
  {
      options = new ArrayList<String>();
      in = new Scanner(System.in);
  }
  
  /** Add an option at the end of the menu
  @param option is the option to add
  */
  
 public void addOption(String option)
 {
   options.add(option);
 }
 
 /** Display the menu
 @return the option number entered by user
 */
 
 public int getInput()
 {
   int input;
   do
   {
      for (int i = 0; i < options.size(); i++)
      {
         int choice = i + 1;
         System.out.println(choice+ ")" + options.get(i));
      }
      input = in.nextInt();
   }// end of do loop
   
   while (input < 1 || input > options.size());
   return input;
   
 }// end of getInput
}// end of class