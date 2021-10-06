package day2;

public class exercise_02 {
    public static void main(String args[])
    {


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
}
