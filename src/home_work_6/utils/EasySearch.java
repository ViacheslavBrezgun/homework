
package home_work_6.utils;

import home_work_6.api.ISearchEngine;

public class EasySearch implements ISearchEngine {


    /**
     * Поиск используя метод IndexOf
     * @param text текст в котором осуществляем поиск
     * @param word искомое слово
     * @return количество раз
     */
    @Override
    public long search(String text, String word) {
        int poz = 0;
        int count = 0;
        int fl = 0;
        while (fl < text.length()) {
            poz = text.indexOf(word, fl);
            if (poz > 0) {
                count++;
                fl = poz + 1;
            } else {
                return count;
            }
        }
        return count;
    }
}


