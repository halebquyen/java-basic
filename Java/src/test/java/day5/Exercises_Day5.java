package day5;

import java.util.Scanner;

public class Exercises_Day5 {
    public static void main(String args[]) {
        //int[] array = enterElements();
        int [] array1 = {10, -20, 0, 30, 40, 60, 10};
        int [] array2 = {10, -20, 0, 30, 40, 60, 2};
        int [] array3 = {2, -20, 0, 30, 40, 60, 10};
        int [] array4 = {10};
        int [] array5 = {10, 10};
        int [] array6 = {10, 10, 10};
        int [] array7 = {10, 10, 20};
        int [] array8 = {2, 10, 10};

        print("array1:true " + validArrayElementFirstLast(array1));
        print("array2:true " + validArrayElementFirstLast(array2));
        print("array3:true " + validArrayElementFirstLast(array3));
        print("array4:false " + validArrayElementFirstLast(array4));
        print("array5:false " + validArrayElementFirstLast(array5));
        print("array6:true " + validArrayElementFirstLast(array6));
        print("array7:true " + validArrayElementFirstLast(array7));
        print("array8:true " + validArrayElementFirstLast(array7));
    }

    /*
    1. Write a Java program to test if 10 appears as either the first or last element of an array of integers. The length of the array must be greater than or equal to 2.
    Viết chương trình kiểm tra nếu số 10 xuất hiện ở đầu hoặc cuối trong mảng. Độ dài của mảng phải lớn hơn 2.
    Sample Output:
    Test Data: array = 10, -20, 0, 30, 40, 60, 10
     */
    public static boolean validArrayElementFirstLast(int[] array) {
        boolean result = false;
        int lengthArray = array.length;
        if ( lengthArray > 2) {
            if (array[0] == 10 || array[lengthArray-1] == 10) {
                result = true;
            }
        }
        else {
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
