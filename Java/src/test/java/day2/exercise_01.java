package day2;

import java.util.Scanner;

public class exercise_01 {
    public static void main(String args[]) {
        validate(enterNumber());
        //validate(10);
        //validate(-30);
        //validate(0);
        //validate(2147483647);
    }

    //Write a Java program to get a number from the user and print whether it is positive or negative
    public static int enterNumber() {
        int number = 0;
        Scanner scanner = null;//
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
}
