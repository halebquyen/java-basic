package day2;

public class SwichCase {
    public static void main(String args[]) {
        int number = 3;
        SwichAndCase(number);
        DoWhileStatement(number);
    }
    public static void SwichAndCase(int number)
    {
        String day = "";
        switch (number) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day ="Invalid day";
                break;
        }
        System.out.println(day);
    }

    public static void DoWhileStatement(int count)
    {
        do {
            System.out.println("Count is: " + count);
            count ++;
        }
        while (count <= 7);
    }


}
