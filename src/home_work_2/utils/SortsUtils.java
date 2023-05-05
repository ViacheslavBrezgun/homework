package home_work_2.utils;

import java.util.Arrays;

public class SortsUtils {
    //4.1.1. Написать метод public static void sort(int[] arr).
    // Данный метод будет сортировать переданный ему массив при помощи алгоритма пузырьковая сортировка.
    // Описание алгоритма: https://prog-cpp.ru/sort-bubble/
    public static void sort(int[] arr) {
        int malinovski = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    malinovski = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = malinovski;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);

        }
    }

    //4.1.2. Написать метод public static void shake(int[] arr).
// Данный метод будет сортировать переданный ему массив при помощи алгоритма шейкерная сортировка.
// Описание алгоритма: https://prog-cpp.ru/sort-shaker/    /
    public static void shake(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int control = right;
        for (; left < right; ) {
            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    control = i;
                }
            }
            right = control;
            for (int i = right; i > left; i--) {
                if (arr[i] < arr[i - 1]) {
                    swap(arr, i, i - 1);
                    control = i;
                }
            }
            left = control;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);

        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
