// Kathleen Kagan
// ACO 101 - Tibbetts

import java.util.Scanner;
import java.util.Random;
import java.lang.*;

public class ACO101Comprehensive
{
   public static void main(String[] args)
   {
      int input = 0;
      do
      {
         Menu mainMenu = new Menu();
         
         mainMenu.addOption("Galaxy");
         mainMenu.addOption("Shopping Spree");
         mainMenu.addOption("Magic 8 Ball");
         mainMenu.addOption("Exit");
         
         input = mainMenu.getInput();
         System.out.println("Input "+ input);
         switch (input)
         {
            case 1: 
            doPlanets();
            break;
            
            case 2:
            doCashRegister();
            break;
            
            case 3:
            doMagic8Ball();
            break;
            
            default:
            break;
         }
      }
      while (input != 4);
    
   }
   /** 
   doPlanet - allows user to create a galaxy of 5+ planets
   */
   public static void doPlanets()
   {
      Planet[] galaxy = new Planet[5];    
      
      galaxy[0] = new Planet("Vulcan", 0.45);
      galaxy[1] = new Planet("Klingon", 1.02);
      galaxy[2] = new Planet("Andoria", 1.37);
      galaxy[3] = new Planet("Omicron Delta", 0.79);
      galaxy[4] = new Planet("Janus VI", 0.86);
      
      Scanner scIn = new Scanner(System.in);
      System.out.println("Please enter a weight on Earth: ");
      double weightOnEarth = scIn.nextDouble();
      
      for (int i = 0; i < galaxy.length; i++)
      {
         System.out.println(weightOnEarth+" lbs on Earth is "+galaxy[i].weightOnPlanet(weightOnEarth)+" lbs on "+galaxy[i].getName());
      }
   }
   
   public static void doCashRegister()
   {
      CashRegister groceries = new CashRegister();
      
      groceries.addItem(12.00);
      groceries.addItem(3.99);
      groceries.addItem(2.49);
      groceries.addItem(5.25);
      groceries.addItem(6.05);
      
      System.out.printf("Total: %.2f\n", groceries.getTotal());
   }
   
   public static void doMagic8Ball()
   {
      Magic8Ball future = new Magic8Ball();
      
      Scanner scIn = new Scanner(System.in);
      System.out.println("Please ask a yes/no question of the Magic 8 Ball: ");
      String askQuestion = scIn.nextLine();
      
		Random answerList = new Random();

		int choice = 1 + answerList.nextInt(19);
		String response = "";		

		if ( choice == 1 )
			response = "It is certain";
		else if ( choice == 2 )
			response = "As I see it, yes.";
		else if ( choice == 3 )
			response = "Reply hazy, try again.";
		else if ( choice == 4 )
			response = "Don't count on it.";
		else if ( choice == 5 )
			response = "Most likely.";
		else if ( choice == 6 )
			response = "Ask again later.";
		else if ( choice == 7 )
			response = "My reply is no.";
		else if ( choice == 8 )
			response = "Without a doubt.";
		else if ( choice == 9 )
			response = "Outlook good.";
		else if ( choice == 10 )
			response = "Better not tell you now.";
		else if ( choice == 11 )
			response = "My sources say no.";
		else if ( choice == 12 )
			response = "Yes - definitely.";
		else if ( choice == 13 )
			response = "Yes.";
		else if ( choice == 14 )
			response = "Cannot predict now.";
		else if ( choice == 15 )
			response = "Outlook not so good.";
		else if ( choice == 16 )
			response = "You may rely on it.";		
		else if ( choice == 17 )
			response = "Signs point to yes.";
		else if ( choice == 18 )
			response = "Concentrate and ask again.";
		else if ( choice == 19 )
			response = "Very doubtful.";
		else 
			response = "8-BALL ERROR!";
      
      System.out.println(response);
   }
}