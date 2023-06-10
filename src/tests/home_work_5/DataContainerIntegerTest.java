package tests.home_work_5;


import home_work_5.DataContainer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;


public class DataContainerIntegerTest {

    @Test
    public void addOneElementToEmptyContainer(){
        DataContainer<Integer> container =
                new DataContainer<>(new Integer[0]);

        int idx = container.add(1);

        Assertions.assertEquals(1, container.get(idx));
    }

    @Test
    public void addTwoElementToEmptyContainer(){
        DataContainer<Integer> container =
                new DataContainer<>(new Integer[0]);

        int idx1 = container.add(1);
        int idx2 = container.add(2);

        Assertions.assertEquals(1, container.get(idx1));
        Assertions.assertEquals(2, container.get(idx2));
    }

    @Test
    public void addOneElementToNotEmptyContainer(){
        DataContainer<Integer> container =
                new DataContainer<>(new Integer[]{1, 2, 3});

        int idx = container.add(777);

        Assertions.assertEquals(777, container.get(idx));
    }

    @Test
    public void addOneElementToNotEmptyContainerWithNull(){
        DataContainer<Integer> container =
                new DataContainer<>(new Integer[]{1, 2, 3, null, null, null});

        int idx = container.add(777);

        Assertions.assertEquals(3, idx);
    }

    @Test
    public void addNull(){
        DataContainer<Integer> container =
                new DataContainer<>(new Integer[]{1, 2, 3, null, null, null});

        int idx = container.add(null);

        Assertions.assertEquals(-1, idx);
    }

    @Test
    public void addToMid(){
        DataContainer<Integer> container =
                new DataContainer<>(new Integer[]{1, null, 3, null, null, null});

        int idx = container.add(777);

        Assertions.assertEquals(1, idx);
    }

    @Test
    public void getIncorrectIndex(){
        DataContainer<Integer> container =
                new DataContainer<>(new Integer[]{});

        Assertions.assertEquals(null, container.get(999));
    }

    @Test
    public void getItems(){
        DataContainer<Integer> container =
                new DataContainer<>(new Integer[]{1, 3, 4});

        container.add(777);

        Integer[] items = container.getItems();

        Assertions.assertArrayEquals(new Integer[]{1, 3, 4, 777}, items);
    }

    @Test
    public void deleteMidElementByIndex(){
        DataContainer<Integer> container =
                new DataContainer<>(new Integer[]{1, 3, 4});

        container.delete(1);

        Assertions.assertEquals(4, container.get(1));
    }

    @Test
    public void deleteFirstElementByIndex(){
        DataContainer<Integer> container =
                new DataContainer<>(new Integer[]{1, 3, 4});

        Assertions.assertTrue(container.delete(0));
        Assertions.assertEquals(3, container.get(0));

    }

    @Test
    public void deleteLastElementByIndex(){
        DataContainer<Integer> container =
                new DataContainer<>(new Integer[]{1, 3, 4});

        Assertions.assertTrue(container.delete(2));
    }

    @Test
    public void deleteByIndexInEmptyContainer(){
        DataContainer<Integer> container =
                new DataContainer<>(new Integer[]{});

        Assertions.assertFalse(container.delete(2));
    }


    @Test
    public void deleteElement(){
        DataContainer<Integer> container =
                new DataContainer<>(new Integer[]{1, 3, 4});

        container.delete((Integer) 3);

        Assertions.assertEquals(4, container.get(1));
    }

    @Test
    public void sort(){
        DataContainer<Integer> container =
                new DataContainer<>(new Integer[]{1, 2, 3});

       Comparator<Integer> comparator = new IntegerComparator();
        Comparator<Integer> reversed = comparator.reversed();
        Comparator<Integer> integerComparator = Comparator.nullsLast(reversed);

        container.sort(integerComparator);

        Integer[] items = container.getItems();

        Assertions.assertArrayEquals(new Integer[]{3, 2, 1}, items);
    }

    @Test
    public void sortCheckOldData(){
        Integer[] data = {3, 2, 1};

        DataContainer<Integer> container =
                new DataContainer<>(data);

        container.sort(new IntegerComparator());

        Integer[] items = container.getItems();

        Assertions.assertFalse(data == items);
        Assertions.assertArrayEquals(new Integer[]{3, 2, 1}, data);
        Assertions.assertArrayEquals(new Integer[]{1, 2, 3}, items);
    }

    @Test
    public void staticComparableSortData(){
        Integer[] data = {3, 2, 1};

        DataContainer<Integer> container =
                new DataContainer<>(data);

        DataContainer.sort(container);

        Integer[] items = container.getItems();

        Assertions.assertFalse(data == items);
        Assertions.assertArrayEquals(new Integer[]{3, 2, 1}, data);
        Assertions.assertArrayEquals(new Integer[]{1, 2, 3}, items);
    }

    @Test
    public void staticSortData(){
        Integer[] data = {3, 2, 1};

        DataContainer<Integer> container =
                new DataContainer<>(data);

        DataContainer.sort(container, new IntegerComparator());

        Integer[] items = container.getItems();

        Assertions.assertFalse(data == items);
        Assertions.assertArrayEquals(new Integer[]{3, 2, 1}, data);
        Assertions.assertArrayEquals(new Integer[]{1, 2, 3}, items);
    }
}
