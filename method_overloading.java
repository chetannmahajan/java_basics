package com.chetanmahajan;

public class Main
{
    public static void main(String[] args)
    {
      CalculateScore("Chetan",91);
      CalculateScore(112);
      CalculateScore();
      calFeetAndInchesToCentimeters(6,0);
    }

    public static int CalculateScore(String playersName, int Score)
    {
        System.out.println("Player's name=" +playersName + "  Player's score=" +Score);
        return 0;
    }

    //In above method CalculateScore if we writing a return value of void then we don't need to return any thing..!
    // and if you are writing a return value of int then you have to return the any integer of integer variable that
    // have been used in program..!

    public static int CalculateScore(int Score)
    {
        System.out.println("Player is unnamed...   Player's score=" +Score);
        return 0;
    }

    public static int CalculateScore()
    {
        System.out.println("No player name with no scores..!");
        return 0;
    }
    // Challenge

    public static double calFeetAndInchesToCentimeters(int feet, int inches)
    {
        if(feet>=0 || (inches>=0 && inches<=12))
        {
            return -1;
        }
        double Totalcentimeters;
        double centimeters1 = inches*2.54;
        double centimeters2 = (feet*12)*2.54;
        Totalcentimeters = centimeters1 + centimeters2;
        System.out.println("The total centimeters is=" +Totalcentimeters);

        return Totalcentimeters;
    }

}
