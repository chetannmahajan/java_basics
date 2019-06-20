package com.company;

public class Main {

    public static void main(String[] args)
    {
        House madhu = new House();

        madhu.setDoors(2);
        madhu.setWindows(4);
        madhu.setAc(1);
        madhu.setName("madhu");

        System.out.println("Now the doors of the house are="+madhu.getDoors());
        System.out.println("Now the windows of the house are="+madhu.getWindows());
        System.out.println("Now the no. of the AC in house are="+madhu.getAc());
        System.out.println("Now the name of the house is="+madhu.getName());
    }
}

package com.company;

public class House {
    private int doors;
    private int windows;
    private int ac;
    private String name;

    public void setDoors(int doors)
    {
        this.doors = doors;
    }

    public int getDoors()
    {
        return this.doors;
    }

    public void setWindows(int windows)
    {
        this.windows = windows;
    }

    public int getWindows()
    {
        return this.windows;
    }

    public void setAc(int ac)
    {
        this.ac = ac;
    }

    public int getAc()
    {
        return this.ac;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }
}