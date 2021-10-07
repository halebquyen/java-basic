package day4;

public class Exercises_Day4 {
    public static void main(String args[]) {
        print(forLoop());
        //print(doWhileLoop());
        //print(doubleForLoop());
        //print(forLoopContinue());
        //print(doWhileLoopContinue());
        //print(whileLoopContinue());
    }

    public static void print(int value) {
        System.out.println(value);
    }

    //1. Viết chương trình vòng lặp for từ 1 - 20, nếu giá trị bằng 8, thoát khỏi vòng lặp.
    public static int forLoop() {
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum  = sum + i;
            if (i == 8) break;
        }
        return sum;
    }
    //2. Viết chương trình vòng lặp do while từ 1 - 100, nếu giá trị bằng 80, thoát khỏi vòng lặp.

    public static int doWhileLoop() {
        int num = 1;
        int sum = 0;
        do {
            sum = sum + 1;
            num++;
            if (sum == 80) break;
        } while (num <= 100);
        return sum;

    }

    //3. Viết chương trình 2 vòng lặp for, vòng lặp 1 từ 1 - 10, vòng lặp 2 từ 1 - 30, nếu vòng lặp 2 gặp giá trị = 4, thoát khỏi vòng lặp 2.

    public static int doubleForLoop() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 30; j++) {
                sum = sum + j;
                if (j == 4) break;
            }
        }
        return sum;
    }

    //4. Viết chương trình vòng lặp for lặp từ 1 - 10, nếu gặp 5, thì tiếp tục vòng lặp.

    public static int forLoopContinue() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
            if (i == 5) continue;
        }
        return sum;
    }

    //5. Viết chương trình vòng lặp do while lặp từ 1 - 10, nếu gặp 5, thì tiếp tục vòng lặp.
    public static int doWhileLoopContinue() {
        int num = 1;
        int sum = 0;
        do {
            sum = sum + 1;
            num++;
            if (sum == 5) continue;
        } while (num <= 10);
        return sum;
    }

    //6. Viết chương trình vòng lặp while lặp từ 1 - 10, nếu gặp 5, thì tiếp tục vòng lặp.
    public static int whileLoopContinue() {
        int num = 1;
        int sum = 0;
        while (num <= 10) {
            sum = sum + num;
            num++;
            if (num == 5) continue;
        }
        return sum;
    }
}

