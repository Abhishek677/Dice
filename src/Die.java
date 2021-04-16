/**
 * Name: Abhishek Jassal
 * Slate Username:jassaaabh
 * PROG24178 OOP JAVA-2
 */

import java.util.*;

/**
 * Programmer: Abhishek Jassal
 * Program: DisplayData.java
 * @author Abhishek 
 * version 2.0
 */
public class Die
{
  /** instance variable for computer name **/
  private String computerName;  
  /** instance variable for user name **/
  private String userName;
  /** instance variable for sides of the dice **/
  private int sides;
  /** instance variable for value of dice **/
  private int value;
  
   /**
    * Constructor with no arguments
    * calls the roll method
    */
   public Die()
   {
    roll();
   }
   
   /**
    * Constructor with arguments
    * @param sides here it add the sides
    */
   public Die(int sides)
   {
    setSides(sides);     //calls set method to check errors 
   }
   
   /**
    * Constructor with arguments
    * @param computerName  adds the computer name
    * @param userName       adds the user name
    */
   public Die(String computerName,String userName)
   {
    setComputerName(computerName);  //call set method to check errors
    setUserName(userName);
   }
   
   /**
    * This method roll the dice and generates the random number out of 6 sides.
    */
   public void roll()                   //instance method
   {
    Random ran =new Random();
    value = ran.nextInt(sides)+1;
   }
   
   
   /**
    * This is getter/accessor method returns the value of random generated number
    * @return int
    */
   public int getValue()
   {
    return value;
   }

   /**
    * This is setter/mutator method sets the value of random generated number
    * @param value 
    */
   public void setValue(int value)
   {
    this.value = value;
   }

   /**
    * This is getter/accessor method returns the sides of dice
    */
   public int getSides()
   {
    return sides;
   }
     
   /**
    * This is setter/mutator method, it checks the sides is equal to 6 and throws exception
    * @param sides 
    */
   public void setSides(int sides)
   {
    if(sides==6)
    this.sides = sides;
    
    else
    throw new IllegalArgumentException("The dice should be six sided");
    
   }

   /**
    * This is getter/accessor method for the entered computer name
    * @return String
    */
   public String getComputerName()
   {
    return computerName;
   }
    
   /**
    * This is setter/mutator method and throws the exception if user entered invalid name
    * @param computerName 
    */
   public void setComputerName(String computerName)
   {
    if( computerName.matches( "\\w\\w\\w-\\d{4}" ) )
    this.computerName = computerName;
     
    else
    throw new IllegalArgumentException(" You enterd Invalid Name Please enter in this sequence (abc-2345) " );
   }
   
   /**
    * This is getter/accessor method for getting user name that entered
    * @return String 
    */
   public String getUserName()
   {
    return userName;
   }
   
   /**
    * This is setter/mutator method it checks the username should not be empty and throws exception
    * @param userName 
    */
   public void setUserName(String userName)
   {
    if(userName == null || userName.isEmpty())
    throw new IllegalArgumentException("You should have to enter your name it can't be Empty");
    
    else
    this.userName = userName;
   }

}