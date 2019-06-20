package com.chetanmahajan;

public class Main
 {

    public static void main(String[] args)
    {
        for(double j=8.0;j>=2.0;j--)
        {
            System.out.println("Calculated the interest for 10,000 at " +j+ "%" +"interest=" +CalculateInterest(10000.0,j));
        }

        for(int i=0; i<=5; i++)
        {
            System.out.println("Loop "+i+" Hello..!");
        }

        int count =0;
        for(int p=10; p<50; p++)
        {
            if(isPrime(p) == true)
            {
                count++;
                System.out.println("Number= " +p);

              if(count ==3)
              {
                  System.out.println("Exiting the for loop..!");
                  break;
              }
            }
        }

    }

        public static double CalculateInterest(double amount, double interest)
     {
        double TotalInterest = (amount *(interest/100));
        return TotalInterest;
     }

    //Challange 1 complete...!

    //Challange 2


        public static boolean isPrime(int n)
        {
            int k=2;
            if(n==1)
            {
                return false;
            }


               else if(n % k == 0)
                {
                    return false;
                }


            return true;
        }

 }
