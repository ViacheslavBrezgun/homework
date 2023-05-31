package home_work_1;

//5.* Создать СТАТИЧЕСКИЙ метод sleepIn рядом с методом main. (Взято с https://codingbat.com/prob/p187868).
//	5.1 Данный метод будет принимает два параметра
//	5.2 Будет отвечать на вопрос спать ли дальше (да\нет) (возвращать true либо false).
//	5.3 Первый параметр boolean weekday обозначает рабочий день
//	5.4 Второй параметр boolean vacation обозначает отпуск.
//	5.5 Если у нас отпуск или не рабочий день то мы можем спать дальше
//	5.6 На основании ответа от метода sleepIn вывести сообщение можем спать дальше или пора идти на работу

import java.util.Scanner;

public class FiveTask {
    public static void main(String[] args) {
        boolean weekday = false;
        boolean vacation = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("сегодня рабочий день? (да/нет) ");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("да")) {
            weekday = true;
        } else {
            vacation = true;
        }

        boolean sms = sleepin(weekday, vacation);
        if (sms) {
            System.out.println("выходной");
        } else {
            System.out.println("будний");
        }
    }

    public static boolean sleepin(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }
}
