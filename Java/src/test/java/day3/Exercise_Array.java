package day3;

import java.util.Scanner;

public class Exercise_Array {
    public static void main(String args[]) {

        int[] array = enterElements();
        System.out.println("Sum of given array is " + sumArray(array));
        System.out.println("Average of given array is " + averageArray(array));
        printOddNumber(array);
        printEvenNumber(array);
        System.out.println("gia tri min la " + minNumber(array));
        System.out.println("gia tri max la " + maxNumber(array));

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

    //1.Write a Java program to calculate sum values of an array
    public static int sumArray(int[] array) {
        int tong = 0;
        try {
            for (int i = 0; i < array.length; i++) {
                tong = tong + array[i];
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.err.println(exception.toString());
            return 0;
        }
        return tong;
    }

    //2. Write a Java  program to calculate average of  values of  an array
    public static double averageArray(int[] array) {
        try {
            int n = array.length;
            int tong = sumArray(array);
            return (double) tong / (double) n;
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.err.println(exception.toString());
            return 0;
        }
    }

    //3.Write a Java program to print even and odd numbers in an array
    public static void printOddNumber(int[] array) {
        System.out.print("Odd numbers : ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static void printEvenNumber(int[] array) {
        System.out.print("Even numbers : ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static int minNumber(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int maxNumber(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static boolean compareArray(int[] array1, int[] array2) {
        if (array1.length == array2.length)
            return true;
        else
            return false;

    }
}
