// 2.1. Найти в тексте все использованные слова и поместить в Set при помощи StringTokenizer
package home_work_6.runners;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;


public class Main1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        try {
            BufferedReader text = new BufferedReader(new FileReader("C:\\Users\\intel i7\\IdeaProjects\\JD1\\HomeWork\\src\\home_work_6\\source\\Война и мир.txt")); // чтение текста с файла
            String st = "";
            while ((st = text.readLine()) != null) { //проверяем построчно есть ли заполненная строка теста и сохраняем эту строку в st
                StringTokenizer tokenizer = new StringTokenizer(st, "1234567890 .!?(){}[]<>#*,:;-\'\"/"); //раскладывает строку на части - слова по делиметру
                while (tokenizer.hasMoreTokens()) {  // функция наличия слов-лексем
                    set.add(tokenizer.nextToken().toLowerCase());// записываем слова на корорые указывает токенайзер в сет и преобразуем в нижний регистр
                }
            }
        } catch (IOException e) {
            System.err.println("Нет такого файла");
        }
        Iterator<String> it = set.iterator();
        while (it.hasNext())
            System.out.println(it.next());
        System.out.println("Количество слов в коллекции set: " + set.size());

    }
}

