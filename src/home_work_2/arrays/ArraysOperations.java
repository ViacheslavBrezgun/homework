package home_work_2.arrays;

import home_work_2.utils.ArrayUtils;

import java.util.Scanner;

public class ArraysOperations {
    public static void sumChetPOL() {
        int[] arrays = ArrayUtils.arrayRandom(5, 10);
        System.out.println("Исходный масив");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(" " + arrays[i]);
        }
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 == 0) {
                sum += arrays[i];
            }
        }
        System.out.println("\n" + sum);
    }

    public static void maxChetIndx() {
        int[] arr = ArrayUtils.arrayRandom(10, 10);
        System.out.println("Исходный масив");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int sum = 0;
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        int[] arayCopy = new int[count];
        int j = 0;

        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0) {
                arayCopy[j] = arr[i];
                j++;
            }
        }
        System.out.println("Массив полученный из четных индексов");
        for (int i = 0; i < arayCopy.length; i++) {
            System.out.println(arayCopy[i]);
        }
        System.out.println("Максимальное среди четных индексов");
        int max = arayCopy[0];
        for (int i = 1; i < arayCopy.length; i++) {
            if (arayCopy[i] > max)
                max = arayCopy[i];
        }
        System.out.println("Максимальное " + max);
    }

    //2.4.3. Элементы массива, которые меньше среднего арифметического
    public static void smallerArithmeticAverages() {
        int[] arr = ArrayUtils.arrayRandom(10, 10);
        System.out.println("Исходный массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("" + arr[i]);
        }
        int sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int sArm = sum / arr.length;
        System.out.println("\n среднее " + sArm);
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < sArm) {
                count++;
            }
        }
        int[] arr2 = new int[count];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < sArm) {
                arr2[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }

    // 2.4.4. Найти два наименьших (минимальных) элемента массива
    public static void MinMin() {
        int[] arr = ArrayUtils.arrayRandom(10, 10);
        System.out.println("Исходный масив");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min2 = min;
                min = arr[i];
            } else if (arr[i] < min2 && arr[i] != min)
                min2 = arr[i];

        }
        System.out.println("\nМинимальное первое: " + min);
        System.out.println("Минимальное второе: " + min2);


    }

    //2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
    public static void Compression() {
        int[] arr = ArrayUtils.arrayRandom(10, 10);
        System.out.println("Исходный масив");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

        System.out.println("\nЗадайте начальную границу интервала");
        Scanner sc = new Scanner(System.in);
        int verInterval = sc.nextInt();
        System.out.println("Задайте конечную границу интервала");
        Scanner sc1 = new Scanner(System.in);
        int nizInterval = sc1.nextInt();
        for (int i1 = 0; i1 < arr.length; i1++) {
            if (arr[i1] >= verInterval && arr[i1] <= nizInterval) {
                for (int j = i1; j < arr.length - 1; j++)
                    arr[j] = arr[j + 1];
                i1--;
                arr[arr.length - 1] = 0;
            }
        }
        for (int i1 = 0; i1 < arr.length; i1++) {
            System.out.print(" " + arr[i1]);
        }
    }

    //2.4.6. Сумма цифр массива
    public static void SumNum() {
        int[] arr = ArrayUtils.arrayRandom(10, 10);
        System.out.println("Исходный масив");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("\nСумма цифр массива: " + sum);
    }
}


