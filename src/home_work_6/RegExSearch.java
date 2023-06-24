package home_work_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine{
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

