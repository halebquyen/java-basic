package day2;

public class exercise_03 {
    public static void main(String args[]) {
        for (int x = 2; x <= 9; x++)
        {
            for (int y = 1; y <= 10; y++)
            {
                if (y == 1)
                    System.out.println("bang cuu chuong " + x);
                System.out.println(x + " x " + y + " = " + x*y);

            }

        }
    }
}
