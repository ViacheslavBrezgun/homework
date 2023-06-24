package home_work_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pr {
    public static void main(String[] args) {
        String text = "Привет мення зовут Аня";
        String word = "Аня";
        Pattern pattern1 = Pattern.compile (word);// регулярка
        Matcher m1 = pattern1.matcher (text);
        boolean b = m1.find();
        System.out.println(b);
    }
}
