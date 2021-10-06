package day2;

public class exercise_04 {
    public static void main(String args[]) {
        int count = 0;
        int number = 1;
        while (number != 0) {
            number = number / 10;
            ++count;
        }
        System.out.println("number of digits " + count);
    }
}
