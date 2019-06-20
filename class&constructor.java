package com.company;

public class Main {

    public static void main(String[] args)
    {

        Laptop mylapy = new Laptop("8GB","1TB",50000,"blue","110mx");
        Tv mytv = new Tv();
        VipCustomer me = new VipCustomer("vaishnavi",562,"chetan211199@rediffmail.com");
        VipCustomer me1 = new VipCustomer();
        System.out.println("total ram is="+mylapy.getRam());
        System.out.println("total rom is="+mylapy.getRom());
    }
}

package com.company;

public class Tv {
    private int size;
    private String colour;
    private String company;
    private int prize;

    public Tv()
    {

        System.out.println("Default constructor is called...1");

    }

    public Tv(String company, int prize) {
        this(1000,"blue","sony",1000);
        this.company = company;
        this.prize = prize;
    }

    public Tv(int size, String  colour, String company, int prize)
    {

        this.size = size;
        this.colour = colour;
        this.company = company;
        this.prize = prize;

        System.out.println("size of the tv is="+size);
        System.out.println("colour of the tv is="+colour);
        System.out.println("type of the company is="+company);
        System.out.println("prize of the company is="+prize);

    }
}

package com.company;

public class Laptop
{
    private String ram;
    private String rom;
    private int prize;
    private String colour;
    private String graphics;

    public Laptop(String ram,String rom,int prize,String colour,String graphics)
    {
        this.ram = ram;
        this.rom = rom;
        this.prize = prize;
        this.colour = colour;
        this.graphics = graphics;
    }

    public String getRam()
    {
        return ram;
    }

    public String getRom()
    {
        return rom;
    }

}

package com.company;

public class VipCustomer {
    private String name;
    private int limit;
    private String emailid;

    public VipCustomer()
    {
        this("chetan",454,"chetannitinmahajan@gmail.com");

        System.out.println("Name of the customer is ="+name);
    }
    public VipCustomer(String name, int limit, String emailid)
    {
        this.name = name;
        this.limit = limit;
        this.emailid = emailid;
        System.out.println("Name of the customer is1="+name);

    }

}
