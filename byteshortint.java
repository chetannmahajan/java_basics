package com.chetanmahajan;

public class Main
{
    public static void main(String[] args)
    {
        byte mybytevalue = 10;

        short myshortvalue= 20;

        int myintvalue= 50;

        long mylongvalue =  50000+10*(mybytevalue+myintvalue+myshortvalue);
        System.out.println("The total value of a mylongvalue is=" +mylongvalue);
    }


}