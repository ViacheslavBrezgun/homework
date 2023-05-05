//    1.5. Задачи в презентации. На сайте есть пояснения по каждой из этих задач. Все задачи в одном классе, в отдельных методах.
//    	1.5.1. Найти наибольшую цифру натурального числа
//    	1.5.2. Вероятность четных случайных чисел
//    	1.5.3. Посчитать четные и нечетные цифры числа
//    	1.5.4. Ряд Фибоначчи
//    	1.5.5. Вывести ряд чисел в диапазоне с шагом
//    	1.5.6. Переворот числа
package home_work_2.loops;

import java.util.Scanner;

public class Loops {

    public static void task151(int x) {
        System.out.println("заданное число: " + x);
        int y = x;
        int count = 0;
        for (; y > 0; ) {
            y = y / 10;
            count++;
        }
        int[] arr = new int[count];
        for (int i = 0; x > 0; i++) {
            arr[i] = x % 10;
            x = x / 10;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("максимальное: " + max);

    }

    public static void task152() {

        double count = 0;
        for (int i = 0; i < 1000; i++) {
            int x = (int) (Math.random() * 10 + 1);
            System.out.print(" " + x);

            if (x % 2 == 0) {
                count++;
            }
        }
        System.out.println(" \n количество четных чисел " + count + "вероятность = " + count / 10 + "%");
    }

    public static void task153(int x) {
        int count = 0;
        int y = x;
        for (; y > 0; ) {
            y = y / 10;
            count++;
        }
        int chetnoe = 0;
        int nechetnoe = 0;
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = x % 10;
            x = x / 10;
            if ((arr[i] % 2 == 0) && (arr[i] != 0)) {
                chetnoe++;
            } else if ((arr[i] % 2 != 0) && (arr[i] != 0)) {
                nechetnoe++;
            }
        }
        System.out.println(chetnoe + "четных и " + nechetnoe + "нечетных");
    }

    public static void task154(int x) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Какое количество чисел Фибоначчи вы хотите увидеть?");
//        int x = sc.nextInt();
        int[] arrayFib = new int[x];
        arrayFib[0] = 0;
        arrayFib[1] = 1;
        System.out.print(arrayFib[0]);
        System.out.print(arrayFib[1]);

        for (int i = 2; i < arrayFib.length; i++) {
            arrayFib[i] = arrayFib[i - 1] + arrayFib[i - 2];
            System.out.print(arrayFib[i]);
        }
    }

    public static void task155(int niz, int werh, int shag) {
//        Scanner sc = new Scanner(System.in);
//            System.out.println("Введите нижний диапазон ");
//            int niz = sc.nextInt();
//            System.out.println("Введите верхний диапазон диапазон ");
//            int werh = sc.nextInt();
//            System.out.println("Введите шаг ");
//            int shag = sc.nextInt();
        int col = werh - niz;
        int[] array = new int[col];
        array[0] = niz;
        for (int i = niz; i <= werh; ) {
            System.out.print(i);
            i += shag;
        }
    }

    public static void task156(int x) {
//            Scanner sc = new Scanner(System.in);
//                System.out.println("Введите число");
//                int x = sc.nextInt();
        int y = x;
        int col = 0;
        while (y > 0) {
            y = y / 10;
            col++;
        }
        int[] arr = new int[col];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = x % 10;
            x = x / 10;
            System.out.print(arr[i]);
        }
    }

}
