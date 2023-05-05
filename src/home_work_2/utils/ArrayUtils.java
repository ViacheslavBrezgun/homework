package home_work_2.utils;

import java.util.Random;
import java.util.Scanner;

//2.1.1. Написать метод public static int[] arrayFromConsole().
// Данный метод размер массива и каждый его элемент запрашивает у пользователя через консоль.
public class ArrayUtils {
    public static int[] arrayFromConsole() {
        System.out.println("Введите размер массива");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.println("Введите " + i + " element ");
            arr[i] = sc.nextInt();
        }
        //for (int i = 0; i < arr.length; i++) {
        //    System.out.print(arr[i]);
        //  }
        return arr;
    }

    //2.1.2. Написать метод public static int[] arrayRandom(int size, int maxValueExclusion).
    // Данный метод принимает два аргумента. Первый (size) указывает размер массива который мы хотим получить.
    // Второй (maxValueExclusion) указывает до какого числа генерировать рандомные числа.
    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * maxValueExclusion);

        }
        return array;
    }
}
