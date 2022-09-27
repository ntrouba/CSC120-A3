import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Class for user and bot conversation to occur
 */
class Conversation{
  /**
   * Execution of conversation begins here
   */
  public static void main(String[] arguments){
    // You will start the conversation here.

    //Declaration of variables
    var user_input = new Scanner(System.in);

    //input = new Scanner(System.in);

    System.out.println("How many rounds of conversation?");

    //Variable that stores the number of rounds
    int num_rounds = user_input.nextInt();

    //List to save the transcript
    ArrayList <String> transcript = new ArrayList<>();

    //Random number generator
    Random rand = new Random(); 

    //List that stores conversational starters
    ArrayList <String> convo_starter = new ArrayList<String>();
    convo_starter.add("What are you thinking about?");
    convo_starter.add("How was your day?");
    convo_starter.add("What do you wanna talk about?");
    convo_starter.add("What's up?");
    convo_starter.add("Hi, how are you?");

    //List that stores canned responses
    ArrayList <String> canned_responses = new ArrayList<String>();
    canned_responses.add("I see");
    canned_responses.add("Very interesting");
    canned_responses.add("Oh, really?");
    canned_responses.add("Wow, that's crazy");
    canned_responses.add("Me too");
    canned_responses.add("I don't know much about that..");

    //Prints line one
    int index = rand.nextInt(convo_starter.size()-1);
    String line_one = convo_starter.get(index); 
    System.out.println(line_one);

    //Adds line_one to the transcript
    transcript.add(line_one);

    //Defines scanner
    Scanner response = new Scanner(System.in);

    //for loop for the amount of rounds the user sellected
    for (int i= 0; i< num_rounds; i++){
      String user_response = response.nextLine();
      user_response = user_response + " ";
      transcript.add(user_response);

      //First response
      String bot_response = "";

      String [] words = user_response.split(" ");
      //Iterates through the words in the user response, and replaces the mirror words.
      for (int r=0; r < words.length; r++){
        if (words[r].equals("you")){
          words[r] = "I";
          bot_response = bot_response + words[r] +" ";
        }
          
        else if (words[r].equals("I")||words[r].equals("i")){
          words[r] = "you";
          bot_response = bot_response + words[r] +" ";
        }

        else if (words[r].equals("are")){
          words[r] = "am";
          bot_response = bot_response + words[r] +" ";
        }

        else if (words[r].equals("was")){
          words[r] = "were";
          bot_response = bot_response + words[r] +" ";
        }

        else if (words[r].equals("am")){
          words[r] = "are";
          bot_response = bot_response + words[r] +" ";
        }

        else if (words[r].equals("my")){
          words[r] = "your";
          bot_response = bot_response + words[r] +" ";
        }

        else if (words[r].equals("your")){
          words[r] = "my";
          bot_response = bot_response + words[r] +" ";
        }

        else if (words[r].equals("me")){
          words[r] = "you";
          bot_response = bot_response + words[r] +" ";
        }

        else{
          bot_response = bot_response + words[r] +" ";
        }
      }

      //If the response has no mirror words it selects a canned response
      if (user_response.equals(bot_response)){
        int index2 = rand.nextInt(canned_responses.size()-1);
        String canned_response = canned_responses.get(index2);
        System.out.println(canned_response);
        transcript.add(canned_response);
      }

      else{
        System.out.println(bot_response);
        transcript.add(bot_response);
      }  

  }

  System.out.println("See ya next time!");
  System.out.println("TRANSCRIPT");
  System.out.println(transcript);

  //Close scanners
  user_input.close();
  //Closes response scanner
  response.close();
  }
}



  
  
   
   




    
    
   
  

