package home_work_5;

import java.util.Arrays;

public class DataContainer<T> {
    private T[] data;
    private T x;
    private int k = 0;
    private int i = 0;

    public DataContainer(T[] data) {
        this.data = data;
    }

    public T get(int index) {
        if (index <= data.length - 1) {
            x = data[index];
        } else {
            x = null;
        }
        return x;
    }

    public T[] getItems() {
        return data;
    }

    public boolean delete(int index) {
        for (i = index; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }
        data[data.length - 1] = null;
        return true;
    }

    public int add(T item) {
        //int flag=0;
        if (item != " ") {
            for (int i = 0; i < data.length; i++) {
                if (data[i] == null) {
                    data[i] = item;
                    k = i;
                    break;
                }

            }

        } else {
            k = -1;
            System.out.println("Нельзя");
        }
/**
 * РАСШИРЕНИЕ МАСИВА
 */
//не могу придумать условие----------------------------------------------------------------------------------------
        T[] data2 = Arrays.copyOf(data, data.length + 1);
        data2[data2.length - 1] = item;
        k = data2.length - 1;
        for (int i = 0; i < data2.length; i++) {
            System.out.println(data2[i]);

        }
        return k;
    }
}









