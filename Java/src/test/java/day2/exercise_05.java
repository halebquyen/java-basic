package day2;

public class exercise_05 {
    public static void main(String args[]) {
        int number = 123456;
        int reverse = 0;
        while (number != 0)
        {
            int sodu = number % 10;
            reverse = reverse * 10 + sodu;
            number = number/10;
        }
        System.out.println("Reversed Number: " + reverse);
    }
}
