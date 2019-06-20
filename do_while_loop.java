package com.chetanmahajan;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args)
    {
	 int count = 1;

	  do
	  {
          System.out.println("The value of count is= "+count);
          count ++;
      }
      while(count != 6);

        System.out.println("*************************");

        int Start = 0;
        int End = 30;
        int TotalEvenNumber = 0;

        do {
            Start++;
            if(IsEvenNuber(Start) == false)
            {
                continue;
            }

            else
                TotalEvenNumber++;
                System.out.println("The number " +Start +" is Even....!");
                if(TotalEvenNumber == 5)
                {
                    break;
                }

        }
        while(Start <= End);
        System.out.println("Total Even number is=" +TotalEvenNumber);
    }


    public static boolean IsEvenNuber(int Number)
    {
        if((Number%2) == 0)
        {
            return true;
        }
        else
            return false;
    }

}
