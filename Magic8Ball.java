import java.lang.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Magic8Ball
{
      private final String PROMPT = "Please ask a question of the Magic 8 Ball";
      private String[] answerList = 
      {
         "It is certain.", "As I see it, yes.", "Reply hazy, try again.", "Don't count on it.", 
         "It is decidely so.", "Most likely.", "Ask again later.", "My reply is no.", 
         "Without a doubt.", "Outlook good.", "Better not tell you now.", "My sources say no.",
         "Yes - definitely.", "Yes.", "Cannot predict now.", "Outlook not so good.", 
         "You may rely on it.", "Signs point to yes.", "Concentrate and ask again.", "Very doubtful.",
          
      };
   
   public String prompt()
   {
      return PROMPT;
   }
   
   /**
   * ask Ask a question of the magic 8-ball
   * @param a question
   * @return an answer
   */
   
   public String ask(String question)
   {
      return answerList[0 + (int)(Math.random()*(answerList.length-1))];
   }

}