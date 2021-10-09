package day5;

import java.util.Scanner;

public class Exercises_Day5 {
    public static void main(String args[]) {
        //int[] array = enterElements();
        int [] array1 = {50, -20, 0, 30, 40, 60, 10};
        int [] array2 = {50, -20, 0, 30, 40, 60, 50};
        int [] array3 = {10};
        int [] array4 = {10, 10};
        int [] array5 = {10, 10, 10};

        print("array1:false " + validArrayElementFirstAndLastTheSame(array1));
        print("array2:true " + validArrayElementFirstAndLastTheSame(array2));
        print("array3:false " + validArrayElementFirstAndLastTheSame(array3));
        print("array4:false " + validArrayElementFirstAndLastTheSame(array4));
        print("array5:true " + validArrayElementFirstAndLastTheSame(array5));
    }

    /*
    1. Write a Java program to test if 10 appears as either the first or last element of an array of integers. The length of the array must be greater than or equal to 2.
    Viết chương trình kiểm tra nếu số 10 xuất hiện ở đầu hoặc cuối trong mảng. Độ dài của mảng phải lớn hơn 2.
    Sample Output:
    Test Data: array = 10, -20, 0, 30, 40, 60, 10
    true
     */
    public static boolean validArrayElementFirstLast(int[] array) {
        boolean result = false;
        int lengthArray = array.length;
        if (lengthArray > 2) {
            if (array[0] == 10 || array[lengthArray - 1] == 10) {
                result = true;
            }
        } else {
            result = false;
        }
        return result;
    }

    /*2. Write a Java program to test if the first and the last element of an array of integers are the same. The length of the array must be greater than or equal to 2.
    Viết chương trình kiểm tra phần tử đầu và phần tử trong mảng giống nhau. Độ dài của mảng phải lớn hơn 2.
    Test Data: array = 50, -20, 0, 30, 40, 60, 10
    Sample Output: false
    */
    public static boolean validArrayElementFirstAndLastTheSame(int[] array) {
        boolean result = false;
        int lengthArray = array.length;
        if (lengthArray > 2) {
            if (array[0] == array[lengthArray - 1]) {
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
