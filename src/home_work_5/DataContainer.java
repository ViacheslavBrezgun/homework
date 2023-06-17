package home_work_5;


import java.util.Arrays;
import java.util.Comparator;

import static java.util.Arrays.copyOf;

public class DataContainer<T> {
    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    public T get(int index) {
        T x;
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
        for (int i = index; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }
        data[data.length - 1] = null;
        return true;
    }


    public int add(T item) {
        if (item == null) {
            return -1;
        }

        int index = -1;

        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == null) {
                index = i;
                break;

            }
        }
        if (index == -1) {
            index = this.data.length;
            this.data = copyOf(this.data, this.data.length + 1);
        }
        this.data[index] = item;
        return index;
    }

    public T[] sortArray(Comparator<T> comparator) {
        for (int i = 0; i < data.length; i++) {
            for (int j = data.length - 1; j > i; j--) {
                if (comparator.compare(data[j - 1], data[j]) > 0) {
                    // Обмен элементов
                    T temp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = temp;
                }
            }
        }
        return data;
    }
}












