package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercises_Day5 {
    public static void main(String args[]) {
        //Exercises 1 here
        Integer[] array1 = {10, -20, 0, 30, 40, 60, 10};
        printElementArray("Test Data: array = ", array1);
        validArrayElementFirstORLastIs10(array1);

        //Exercises 2 here
        int[] array2 = {50, -20, 0, 30, 40, 60, 10};
        validArrayElementFirstAndLastTheSame(array2);

        //Exercises 3 here
        int[] array3 = {50, -20, 0, 30, 40, 60, 10};
        int[] array4 = {45, 20, 10, 20, 30, 50, 11};
        valid2ArrayElementFirstAndLastTheSame(array3, array4);


        //Exercises 4 here
        int[] array5 = {50, -20, 0};
        int[] array6 = {5, -50, 10};
        printArray("Array1: ", array5);
        printArray("Array2: ", array6);
        printArray("New Array:", createNewArray(array5, array6));

        //Exercises 5 here
        int[] array7 = {5, 7};
        printArray("Original Array: ", array7);
        checkElementValue(array7);

        int[] array8 = {4, 1};
        printArray("Original Array: ", array8);
        checkElementValue(array8);

        int[] array9 = {0, 1};
        printArray("Original Array: ", array9);
        checkElementValue(array9);

        //Exercises 6 here
        int[] array10 = {20, 30, 40};
        //rotateArray()
        printArray("Original Array: ", array10);
        //printArray("Rotated Array: ", rotateArray(array));
        printArray("Rotated Array: ", rotateArray(array10));

        //Exercises 7 here
        int[] array11 = {20, 30, 1};
        printArray("Original Array: ", array11);
        print("Larger value between first and last element: " + maxFirstLastElement(array11));

        //Exercises 8 here
        int[] array12 = {20, 30, 40};
        printArray("Original Array: ", array12);
        printArray("New array after swapping the first and last elements: ", swapFirstLast(array12));


        //Exercises 9 here
        int[] array = {10, 30, 5, 50, 67};
        printArray("Original Array: ", array);
        print("Largest element between first, last, and middle values: " + maxFirstMiddleLast(array));

        //Exercises 10 here
        printPATHTEMPUSERNAME();

        //Exercises 11 here
        int[] array13 = {0};
        countEvenAndOdd(array13);

        //Exercises 13 here
        int number = enterNumber("Enter number");
        System.out.println("Square root of " + number + " is:" + squareRoot(number));

        //Exercises 15 here
        String[] arrayDictionary1 = {"cat", "flag", "green", "country", "w3resource"};
        System.out.println("Original dictionary" + Arrays.toString(arrayDictionary1));
        printElementArrayList("Result: ", longestWords(arrayDictionary1));

        String[] arrayDictionary2 = {"cat", "dog", "red", "is", "am"};
        System.out.println("Original dictionary" + Arrays.toString(arrayDictionary2));
        printElementArrayList("Result: ", longestWords(arrayDictionary2));


        //Exercises 17 here
        int day = enterNumber("Enter number");
        printDay(day);

        //Exercises 18 here
        int month = enterNumber("Enter month");
        printMonth(month);

        //Exercises 19 here
        int year = enterNumber("Enter year");
        boolean isLeap = isLeap(year);
        if (isLeap == true) {
            System.out.println(year + " là năm nhuận.");
        } else {
            System.out.println(year + " không phải là năm nhuận.");
        }

        //Exercises 20 here
        String str = "   Hello World        ";
        print(trimString(str));
    }

    /*
    1. Write a Java program to test if 10 appears as either the first or last element of an array of integers.
    The length of the array must be greater than or equal to 2.
    Sample Output:
    Test Data: array = 10, -20, 0, 30, 40, 60, 10
    true
     */
    public static void validArrayElementFirstORLastIs10(Integer[] array) {
        boolean result = false;
        int lengthArray = array.length;
        if (lengthArray >= 2) {
            if (array[0] == 10 || array[lengthArray - 1] == 10) {
                result = true;
            }
        }
        print(result);
    }

    /*2. Write a Java program to test if the first and the last element of an array of integers are the same.
    The length of the array must be greater than or equal to 2.
    Test Data: array = 50, -20, 0, 30, 40, 60, 10
    Sample Output: false
    */
    public static void validArrayElementFirstAndLastTheSame(int[] array) {
        boolean result = false;
        int lengthArray = array.length;
        if (lengthArray >= 2 && array[0] == array[lengthArray - 1]) {
            result = true;
        }
        print(result);
    }

    /*
    3. Write a Java program to test if the first and the last element of two arrays of integers are the same.
    The length of the array must be greater than or equal to 2.
    Test Data:
    array1 = 50, -20, 0, 30, 40, 60, 12
    array2 = 45, 20, 10, 20, 30, 50, 11
    Sample Output: false
     */
    public static void valid2ArrayElementFirstAndLastTheSame(int[] array1, int[] array2) {
        boolean result = false;
        int lengthArray1 = array1.length;
        int lengthArray2 = array2.length;
        if (lengthArray1 >= 2 && lengthArray2 >= 2) {
            if (array1[0] == array2[0] && array1[lengthArray1 - 1] == array2[lengthArray2 - 1]) {
                result = true;
            }
        }
        print (result);
    }

    /*
    4. Write a Java program to create a new array of length 2 from two arrays of integers with three elements and the new array will contain the first and last elements from the two arrays.
    Test Data: array1 = 50, -20, 0
    array2 = 5, -50, 10
    Sample Output:
    Array1: [50, -20, 0]
    Array2: [5, -50, 10]
    New Array: [50, 10]
     */
    public static int[] createNewArray(int[] array1, int[] array2) {
        int[] arrayNew = new int[2];
        if (array1.length == 3 && array2.length == 3) {
            arrayNew = new int[]{array1[0], array2[2]};
        }
        return arrayNew;
    }

    /*
    5. Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7.
    Viết chương trình kiểm tra các phần tử có chữ số 4 hoặc 7.
    Sample Output:
    Original Array: [5, 7]
    true
     */
    public static void checkElementValue(int[] array) {
        boolean result = false;
        if (array.length == 2) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 4 || array[i] == 7)
                    result = true;
            }
        }
        print( result);
    }

    /*
    6. Write a Java program to rotate an array (length 3) of integers in the left direction.
    Viết chương trình đảo thứ tự của mảng.
    Sample Output:
    Original Array: [20, 30, 40]
    Rotated Array: [30, 40, 20]
     */
    public static int[] rotateArray(int[] array) {
        if (array.length == 3) {
            int temp = array[0];
            for (int i = 0; i < array.length - 1; i++)
                array[i] = array[i + 1];
            array[array.length - 1] = temp;
        }
        return array;
    }

    /*
    7. Write a Java program to get the larger value between the first and last element of an array (length 3) of integers .
    Viết chương trình tìm số lớn nhất giữa 2 phần tử đầu & cuối.
    Sample Output:
    Original Array: [20, 30, 40]
    Larger value between first and last element: 40
     */
    public static int maxFirstLastElement(int[] array) {
        int max = array[0];
        if (array[2] >= max)
            max = array[2];
        return max;
    }

    /*
    8. Write a Java program to swap the first and last elements of an array (length must be at least 1) and create a new array.
    Viết chương trình đảo phần tử đầu tiên và phần tử cuối cùng. Sau đó tạo mảng mới.
    Sample Output:
    Original Array: [20, 30, 40]
    New array after swapping the first and last elements: [40, 30, 20]
     */
    public static int[] swapFirstLast(int[] array) {
        if (array.length >= 1) {
            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;
        }
        return array;
    }

    /*
    9. Write a Java program to find the largest element between first, last, and middle values from an array of integers (even length).
    Viết chương trình tìm số lớn nhất giữa phần tử đầu tiên, phần tử giữa, và phần tử cuối cùng.
    Sample Output:
    Original Array: [20, 30, 40, 50, 67]
    Largest element between first, last, and middle values: 67
     */
    public static int maxFirstMiddleLast(int[] array) {
        int max = -1;
        if (isOdd(array.length)) {
            max = array[0];
            if (max <= array[array.length - 1])
                max = array[array.length - 1];
            if (max <= array[array.length / 2])
                max = array[array.length / 2];
        } else {
            System.out.println("Input invalid");
        }
        return max;
    }

    /*
    10. Write a Java program to get the value of the environment variable PATH, TEMP, USERNAME.
    Viết chương trình in các giá trị trong biến PATH, TEMP, USERNAME
     */
    public static void printPATHTEMPUSERNAME() {
        print("Environment variable PATH = " + System.getenv("PATH"));
        print("Environment variable TEMP = " + System.getenv("TEMP"));
        print("Environment variable USERNAME = " + System.getenv("USERNAME"));
    }

    /*
    11. Write a Java program to count the number of even and odd elements in a given array of integers.
    Viết chương trình đếm số chẵn lẻ trong 1 mảng
     */
    public static void countEvenAndOdd(int[] array) {
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (isEven(array[i])) {
                countEven++;
            } else if (isOdd(array[i])) {
                countOdd++;
            }
        }
        print("Total even in array is:" + countEven);
        print("Total even in array is:" + countOdd);
    }

    /*
    13. Write a Java program to compute the square root of a given integer.
    Viết chương trình tính căn bậc hai.
    Input a positive integer: 25
    Square root of 25 is: 5
     */
    public static int squareRoot(int number) {
        int squareRoot = 0;
        if (number == 0 || number == 1) {
            squareRoot = number;
        } else {
            squareRoot = (int) Math.sqrt(number);
        }
        return squareRoot;
    }

    //15. Write a Java program to find all of the longest words in a given dictionary.

    public static ArrayList<String> longestWords(String[] array) {
        ArrayList<String> listResult = new ArrayList<String>();
        int longestLength = 0;
        for (String str : array) {
            int length = str.length();
            if (length > longestLength) {
                longestLength = length;
                listResult.clear();
            }
            if (length == longestLength) {
                listResult.add(str);
            }
        }
        return listResult;
    }

    //17. Viết chương trình nhập 1 số từ 1 đến 7, sau đó trả ra Thứ trong tuần.
    public static void printDay(int day) {
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        print(dayName);
    }


    //Viết chương trình nhập 1 số từ 1 đến 12, sau đó trả ra Tháng trong năm.
    public static void printMonth(int month) {
        String monthName;
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid month";
                break;
        }
        print(monthName);
    }

    //19. Viết chương trình nhập 1 năm bất kỳ, sau đó trả ra là năm nhuận hay không.
    public static boolean isLeap(int year) {
        if ((year % 4 == 0) && year % 100 != 0) {
            return true;
        } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    //20. Viết chương trình nhập 1 chuỗi, và xóa khoảng trắng đầu cuối của chuỗi
    public static String trimString(String str) {
        str = str.trim();
        return str;
    }


    public static boolean isEven(int number) {
        boolean isEven = false;
        if (number % 2 == 0)
            isEven = true;
        return isEven;
    }

    public static boolean isOdd(int number) {
        boolean isOdd = false;
        if (number % 2 != 0)
            isOdd = true;
        return isOdd;
    }

    public static void Swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
    }

    public static void printElementArray(String content, Integer[] array) {
        String message = "";
        for (int i = 0; i < array.length; i++) {
            if (array.length == 1) {
                message = content + array[i];
            } else {
                if (i == 0) {
                    message = content + array[i] + ", ";
                } else if (i < array.length - 1) {
                    message = message + array[i] + ", ";
                } else {
                    message = message + array[i];
                }
            }

        }
        System.out.println(message);
    }

    public static void printElementArrayList(String content, ArrayList<String> arrayList) {
        String[] array = new String[arrayList.size()];
        arrayList.toArray(array);
        String message = "";
        for (int i = 0; i < array.length; i++) {
            if (array.length == 1) {
                message = content + array[i];
            } else {
                if (i == 0) {
                    message = content + array[i] + ", ";
                } else if (i < array.length - 1) {
                    message = message + array[i] + ", ";
                } else {
                    message = message + array[i];
                }
            }
        }
        System.out.println(message);
    }

    public static int enterNumber(String content) {
        System.out.print(content + " ");
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

    public static void printArray(String content, int[] array) {
        System.out.println(content + Arrays.toString(array));
    }

    public static <E> void displayElementArray(E[] inputArray) {
        // Display array elements
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static <T> void print(T value) {
        System.out.println(value);
    }

}
