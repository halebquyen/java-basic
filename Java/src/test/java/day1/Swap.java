package day1;

public class Swap {
    public static void main(String args[]) {
        int x = 5;
        int y = 10;
        Swap1(x,y);
        System.out.println("x= " + x);
        System.out.println("y= " + y);
        Swap2(x,y);
        System.out.println("x= " + x);
        System.out.println("y= " + y);
    }
    public static void Swap1(int a, int b)
    {
        int temp;
        temp = a;
        a = b;
        b = temp;
    }

    public static void Swap2 (int a, int b)
    {
        a = a + b;
        b = a - b;
        a = a - b;
    }
}