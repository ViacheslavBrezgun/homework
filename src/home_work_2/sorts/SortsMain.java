package home_work_2.sorts;

import home_work_2.utils.SortsUtils;

import java.util.Arrays;

public class SortsMain {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] array2 = new int[]{1, 1, 1, 1};
        int[] array3 = new int[]{9, 1, 5, 99, 9, 9};
        int[] array4 = new int[]{};
        int[] array5 = new int[]{6, 5, 4, 3, 2, 1};


//        SortsUtils.sort(array5);
        SortsUtils.shake(array5);

    }
}
