package tests.home_work_2.arrys;

import home_work_2.arrays.ArraysOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysOperationsTest {
    ArraysOperations op = new ArraysOperations();


    //2.4.1. Сумма четных положительных элементов массива
    @Test
    void sumChetPOL() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int expected = 12;
        int[] arr1 = {1, 1, 1, 1};
        int[] arr2 = {9, 1, 6, 99, 9, 9};
        int[] arr3 = {};
        int[] arr4 = {6, 5, 4, 3, 2, 1};
        int actual = ArraysOperations.sumChetPOL(arr);
        Assertions.assertEquals(expected, actual);
        int actual1 = ArraysOperations.sumChetPOL(arr1);
        Assertions.assertEquals(0, actual1);
        int actual2 = ArraysOperations.sumChetPOL(arr2);
        Assertions.assertEquals(6, actual2);
        int actual3 = ArraysOperations.sumChetPOL(arr3);
        Assertions.assertEquals(0, actual3);
    }

//		2.4.2. Максимальный из элементов массива с четными индексами

    @Test
    void maxChetIndx() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr1 = {1, 1, 1, 1};
        int[] arr2 = {9, 1, 6, 99, 9, 9};

        int actual = ArraysOperations.maxChetIndx(arr);
        Assertions.assertEquals(5, actual);
        int actual1 = ArraysOperations.maxChetIndx(arr1);
        Assertions.assertEquals(1, actual1);
        int actual2 = ArraysOperations.maxChetIndx(arr2);
        Assertions.assertEquals(9, actual2);


    }
//		2.4.3. Элементы массива, которые меньше среднего арифметического

    @Test
    void smallerArithmeticAverages() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] expekted = {1, 2};
        int[] arr1 = {1, 1, 1, 1, 4, 5};
        int[] expekted1 = {1, 1, 1, 1};
        int[] arr2 = {9, 1, 6, 99, 9, 9};
        int[] expekted2 = {9, 1, 6, 9, 9};
        int[] actual = ArraysOperations.smallerArithmeticAverages(arr);
        Assertions.assertArrayEquals(expekted, actual);
        int[] actual1 = ArraysOperations.smallerArithmeticAverages(arr1);
        Assertions.assertArrayEquals(expekted1, actual1);
        int[] actual2 = ArraysOperations.smallerArithmeticAverages(arr2);
        Assertions.assertArrayEquals(expekted2, actual2);
    }
//		2.4.4. Найти два наименьших (минимальных) элемента массива

    @Test
    void MinMin() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] expekted = {1, 2};

        int[] actual = ArraysOperations.MinMin(arr);
        Assertions.assertArrayEquals(expekted, actual);

    }
//		2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу

    @Test
    void Compression() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] expekted = {3, 4, 5, 6, 0, 0};

        int[] actual = ArraysOperations.Compression(arr);
        Assertions.assertArrayEquals(expekted, actual);
    }
//		2.4.6. Сумма цифр массива

    @Test
    void SumNum() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int expekted = 21;
        int actual = ArraysOperations.SumNum(arr);
        Assertions.assertEquals(expekted, actual);
    }
}