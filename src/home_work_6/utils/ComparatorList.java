package home_work_6;

import java.util.*;

public class ComparatorList implements Comparator <Map.Entry<String,Integer>> {

    /**
     * сортирует по количеству использований в тексте от большего к меньшему
     * предоставляет метод сравнения двух записей на основе их целочисленных значений
     * @param o1 1 объект
     * @param o2 2 объект
     * @return возвращает результат сравнени количества использований слова.
     */
    @Override
    public int compare(Map.Entry<String,Integer> o1, Map.Entry<String,Integer> o2) {
        return o2.getValue()-o1.getValue();

    }
}
