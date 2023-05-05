package home_work_2.arrays;

import home_work_2.utils.ArrayUtils;

public class ArraysIteration {
    public static void AllElements() {
        int[] arr = ArrayUtils.arrayFromConsole();
        int i = 0;
        System.out.println("\nDO-WHILE ");

        do {
            System.out.print(arr[i]);
            i++;
        } while (i < arr.length);

        i = 0;
        System.out.println("\nWHILE ");

        while (i < arr.length) {
            System.out.print(arr[i]);
            i++;
        }
        System.out.println("\nFOR ");

        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("\nFOReach ");

        for (int a : arr) {
            System.out.print(a);
        }
    }

    public static void AllTwoElements() {
        int[] arr = ArrayUtils.arrayFromConsole();
        int i = 1;
        System.out.println("\n DO WHILE");
        do {
            System.out.println(arr[i]);
            i += 2;
        } while (i < arr.length);

        System.out.println("\n  WHILE");
        i = 1;
        while (i < arr.length) {
            System.out.println(arr[i]);
            i += 2;
        }
        System.out.println("\n FOR");

        for (i = 1; i < arr.length; i += 2) {
            System.out.println(arr[i]);
        }
        System.out.println("\n FOR EACH");

        for (int a : arr) {
            System.out.println(a);
        }
    }

    public static void AllReverseElements() {
        int[] arr = ArrayUtils.arrayFromConsole();
        int i = arr.length - 1;
        System.out.println("DO-WHILE ");
        do {
            System.out.print(arr[i]);
            i--;

        } while (i >= 0);
        i = arr.length - 1;

        System.out.println(" \nWHILE");
        while (i >= 0) {
            System.out.print(arr[i]);
            i--;
        }
        System.out.println("\nFOR");

        for (i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }

        System.out.println("\nFORIACH");
        for (int a : arr) {
            System.out.print(a);
        }

    }
}
