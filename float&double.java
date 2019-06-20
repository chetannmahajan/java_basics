package com.chetanmahajan;

public class Main
{
    public static void main(String[] args)
    {
        //width of an integer is 32 (4 bytes)
        int i=10;
        //width of an float is 32 (4 bytes)
        float f=5f/3;
        //width of an double is 64 (8 bytes)
        double d=10.3d/3;
        System.out.println("Value of float is=" +f);
        System.out.println("Value of double is="+d);

        //extra work
        int numberofpounds=200;
        double totalkilos = numberofpounds*0.45359237;
        System.out.println("The total kilogram is="+totalkilos);
    }

}