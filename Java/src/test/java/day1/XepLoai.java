package day1;

public class XepLoai {
    public static void main(String args[])
    {
        double [] number = {-1, 0, 3.4, 3.5, 4.9, 5.0, 6.4, 6.5, 7.9, 8.0, 10.0, 11};
        for (int i = 0; i< number.length; i++)
        {
            XepLoai(number[i]);
        }
    }
    public static void XepLoai(double mark)
    {
        String message = "";
        if (mark >= 0 && mark < 3.5)
        {
            message = "Kem";
        }
        else if (mark >= 3.5 && mark < 5.0)
        {
            message = "Yeu";
        }
        else if (mark >= 5.0 && mark < 6.5)
        {
            message = "Trung Binh";
        }
        else if (mark >= 6.5 && mark < 8.0)
        {
            message = "Kha";
        }
        else if (mark >= 8.0 && mark <= 10.0)
        {
            message = "Gioi";
        }
        else
            message ="Diem khong hop le";
        System.out.println(mark + " Xep Loai  " + message);
    }
}
