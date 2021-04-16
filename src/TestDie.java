/**
 * Name: Abhishek Jassal
 * Slate Username:jassaaabh
 * PROG24178 OOP JAVA-2
 */

import java.util.*;         //For Scanner class

/**
 * Programmer: Abhishek Jassal
 * Program: DisplayData.java
 * @author Abhishek 
 * version 2.0
 */
public class TestDie
{ 
  public static final int DIE1SIDES = 6;
  public static final int DIE2SIDES = 6;
  public static final int MAX_ROLLS = 10;
         

   /**
   * Method to test the object
   * @param args unused
   *
   **/
  public static void main(String[] args)
  { // start of method
   int userWins=0;
   int compWins=0;
   
   Scanner input =new Scanner(System.in);   // scanner class for taking user input
   
   // try and catch block  
   try                                                                 
   { //start try block
    System.out.print("Enter Computer Name: ");
    String compName = input.nextLine();    // user input for computer
    
   
    System.out.print("Enter Your Name: ");
    String yourName = input.nextLine();    // user input for own
        
    Die names =new Die(compName,yourName);
        
    Die die1_Sides = new Die(DIE1SIDES);                // This adding the sides in the dice, 6 sides    
    Die die2_Sides = new Die(DIE2SIDES);   
        
    System.out.println("\n"+"This simulates the rolling of Die1 and Die2 each of 6 sided and Rolling the dice 10 times " +"\n" );
        
    System.out.println ("Die1"+ "     " +"Die2");
        
    for(int i=1;i<=MAX_ROLLS;i++)               //this for loops rolls the dice 10 times
    {
     die1_Sides.roll();                        // In this roll method is calls and generates random values for computer dice
     die2_Sides.roll();                        // This is for user
        
     System.out.println(die1_Sides.getValue()+"          "+die2_Sides.getValue());  // it gets the random value when rolls method calls

     if(die1_Sides.getValue() > die2_Sides.getValue())    // this loop checks the random value of die
     userWins++;
     
     else
     compWins++;
    }
        
    System.out.println("Computer: "+ compWins++ +"      "+ "user: " + userWins++);  //Its prints total number winning of both players 
        
    if(userWins>compWins)
    System.out.println("The Grand Winner is User: " + names.getUserName() );
    
    else if (userWins<compWins)
    System.out.println("Grand Winner is Computer: " + names.getComputerName());
    
    else if(userWins == compWins)
    System.out.println("Match is tied between computer "+names.getComputerName()+" and user "+names.getUserName());
    }//end of try block
        
    catch(Exception ex)
    { 
     System.out.println("This is catch block " +ex.getMessage());           
    }
       
    } //end of main method  block
   } // end of class block

