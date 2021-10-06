package day2;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Exercises {
    public static void main(String args[]) {
        for(int i = 0; i <=100; i++)
        {
            isPrimeNumber(i);
        }
    }

    public static int enterNumber() {
        int number = 0;
        Scanner scanner = null;
        System.out.println("Enter number");
        try {
            scanner = new Scanner(System.in);
            number = scanner.nextInt();
        } catch (Exception exception) {
            System.err.println(exception.toString());
            return 0;
        }
        return number;
    }

    public static void validate(int number) {
        String message = "";
        if (number > 0)
            message = "So nhap vao la duong " + number;
        else if (number < 0) {
            message = "So nhap vao la am " + number;
        } else
            message = "So nhap vao khong phai la so am hay so duong";
        System.out.println(message);
    }

    public static void findLargestNumber(int num1, int num2, int num3)
    {
        int number_greatest = 0;
        if (num1 >= num2 && num1 >= num3) {
            number_greatest = num1;
        }
        else if (num2 >= num1 && num2 >= num3) {
            number_greatest = num2;
        }
        else
            number_greatest = num3;
        System.out.println("So lon nhat la: " + number_greatest);
    }

    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        System.out.println("So nguyen to " + n);
        return true;

    }
}
