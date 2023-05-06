//4.6 Определить високосный год или нет

package home_work_1.fourTask;

public class FourTask6 {
    public static void main(String[] args) {
        int year = 1764;
//        if (year % 4 != 0) {
//            System.out.println("не високосный");
//        } else if (year % 400 == 0) {
//            System.out.println("Високосный год");
//        } else if (year % 100 == 0) {
//            System.out.println("не високосный");
//        } else {
//            System.out.println("Високосный год");
//        }
        if ((year % 4 != 0) || (year % 100 == 0)) {
            System.out.println("не високосный");
        } else {
            System.out.println("Високосный год");
        }
    }
}