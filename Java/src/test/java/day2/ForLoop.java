package day2;

public class ForLoop {
    public static void main(String args[])  {
        int x = 0;
        //WhileStatement(x);
        DoWhileStatement(x);
    }

    public static void WhileStatement(int count) {

        while (count < 5)  {
            System.out.println(count);
            count++;
        }
    }

    public static void DoWhileStatement(int count) {
        do {
            System.out.println(count);
            count++;
        }
        while (count < 5);
    }

}
