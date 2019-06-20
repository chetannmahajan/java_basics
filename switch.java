package com.chetanmahajan;

public class Main {

    public static void main(String[] args)
    {
        int ch=6;

        switch(ch)
        {
            case 1:
                System.out.println("Value of choice is 1");
             break;

            case 2:
                System.out.println("Value of choice is 2");
                break;

            case 3:
                System.out.println("Value of choice is 3");
                break;

            case 4:
                System.out.println("Value of choice is 4");
                break;

            case 5:
                System.out.println("Value of choice is 5");
                break;

            // We can also do this....
            case 6:
            case 7:
            case 8:
                System.out.println("This value of choice is 6,7 or 8");
             break;


            default:
                System.out.println("The value of choice is not 1,2,3,4 or 5....!");
             break;
        }

        //Challange

        char choice='c';

        switch(choice)
        {
        case 'a':
            System.out.println("Value of the choice is a");
         break;

         case 'b':
            System.out.println("Value of the choice is b");
         break;

         case 'c':
            System.out.println("Value of the choice is c");
         break;

        default:
            System.out.println("Value didn't found");
         break;
        }
    }
}
