package home_work_6;

import home_work_6.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {


    /**
     * поиск при помощи класса Matcher
     * @param text текст в котором осуществляем поиск
     * @param word искомое слово
     * @return количество раз
     */
    @Override
    public long search(String text, String word) {
        int poz = 0;
        int count = 0;
        int fl = 0;
            Pattern pattern1 = Pattern.compile (word);
            Matcher m1 = pattern1.matcher (text);
        while (m1.find()) {
                count++;
        }
        return count;
    }
    }
