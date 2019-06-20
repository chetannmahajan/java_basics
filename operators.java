package com.chetanmahajan;

public class Main
{
    public static void main(String[] args) {
        int result = 1 + 9;
        System.out.println("result is=" + result);

        int previousResult = result;
        result = result - 1;
        System.out.println("Now this is result=" + result);

        result = result + 1;
        System.out.println("Now the value of the result is =" + result);

        result = result / 5;
        System.out.println("the division is after the division=" + result);

        result = result + 8;
        result = result * 2;
        System.out.println("This after the addition of 8 and multiplication by 2=" + result);

        result = result % 8;
        System.out.println("The result by modulus of 8 is=" + result);

        result++;
        System.out.println("Now the value of the result after the increment=" + result);

        result--;
        System.out.println("Now the value of the result after the decrement =" + result);

        result += 2;
        System.out.println("now the answer is =" + result);

        //now we can use upper syntax of operators like "/=3"...! for any operator..!

        boolean isAlien = false;
        if (isAlien == false)
        {
            System.out.println("OK I got it...!");
        }

    }
}
