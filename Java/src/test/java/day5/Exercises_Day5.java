package day5;

import java.util.Scanner;

public class Exercises_Day5 {
    public static void main(String args[]) {
        //int[] array = enterElements();
        int[] array1 = {50, -20, 0, 30, 40, 60, 12};
        int[] array2 = {45, 20, 10, 20, 30, 50, 11};
        print("false " + valid2ArrayElementFirstAndLastTheSame(array1, array2));

        int[] array3 = {50, -20, 0, 30, 40, 60, 12};
        int[] array4 = {45, 20, 10, 20, 30, 50, 12};
        print("false " + valid2ArrayElementFirstAndLastTheSame(array3, array4));

        int[] array5 = {10, 20, 30};
        int[] array6 = {10, 20, 30};
        print("true " + valid2ArrayElementFirstAndLastTheSame(array5, array6));

        int[] array7 = {10, 30};
        int[] array8 = {10, 30};
        print("true " + valid2ArrayElementFirstAndLastTheSame(array7, array8));

        int[] array9 = {10};
        int[] array10 = {10};
        print("false " + valid2ArrayElementFirstAndLastTheSame(array9, array10));

        int[] array11 = {50, -20, 0, 30, 40, 60, 12};
        int[] array12 = {50, -20, 0, 30, 40, 60, 10};
        print("false " + valid2ArrayElementFirstAndLastTheSame(array11, array12));
    }

    /*
    1. Write a Java program to test if 10 appears as either the first or last element of an array of integers.
    The length of the array must be greater than or equal to 2.
    Sample Output:
    Test Data: array = 10, -20, 0, 30, 40, 60, 10
    true
     */
    public static boolean validArrayElementFirstORLastIs10(int[] array) {
        boolean result = false;
        int lengthArray = array.length;
        if (lengthArray >= 2) {
            if (array[0] == 10 || array[lengthArray - 1] == 10) {
                result = true;
            }
        } else {
            result = false;
        }
        return result;
    }

    /*2. Write a Java program to test if the first and the last element of an array of integers are the same.
    The length of the array must be greater than or equal to 2.
    Test Data: array = 50, -20, 0, 30, 40, 60, 10
    Sample Output: false
    */
    public static boolean validArrayElementFirstAndLastTheSame(int[] array) {
        boolean result = false;
        int lengthArray = array.length;
        if (lengthArray >= 2) {
            if (array[0] == array[lengthArray - 1]) {
                result = true;
            }
        } else {
            result = false;
        }
        return result;
    }

    /*
    3. Write a Java program to test if the first and the last element of two arrays of integers are the same.
    The length of the array must be greater than or equal to 2.
    Test Data:
    array1 = 50, -20, 0, 30, 40, 60, 12
    array2 = 45, 20, 10, 20, 30, 50, 11
    Sample Output: false
     */
    public static boolean valid2ArrayElementFirstAndLastTheSame(int[] array1, int[] array2) {
        boolean result = false;
        int lengthArray1 = array1.length;
        int lengthArray2 = array2.length;
        if (lengthArray1 >= 2 && lengthArray2 >= 2) {
            if (array1[0] == array2[0] && array1[lengthArray1 - 1] == array2[lengthArray2 - 1]) {
                result = true;
            }
        } else {
            result = false;
        }
        return result;
    }

    public static void print(int value) {
        System.out.println(value);
    }

    public static void print(boolean value) {
        System.out.println(value);
    }

    public static void print(String value) {
        System.out.println(value);
    }

    public static int enterNumber() {
        System.out.print("Enter Number: ");
        int n = 0;
        Scanner s = null;
        try {
            s = new Scanner(System.in);
            n = s.nextInt();
        } catch (Exception ex) {
            System.err.println(ex.toString());
            n = 0;
        }
        return n;
    }

    public static int[] enterElements() {
        int numbers;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter elements in array : ");
        numbers = sc.nextInt();
        int[] arrNum = new int[numbers];
        System.out.println("Enter " + numbers + " elements : ");
        for (int i = 0; i < arrNum.length; i++) {
            arrNum[i] = sc.nextInt();
        }
        return arrNum;
    }
}
