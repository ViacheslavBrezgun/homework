// 2.1.Найти в тексте все использованные слова и поместить в Set при помощи регулярных выражений
package home_work_6.runners;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String fileName = "C:\\Users\\intel i7\\IdeaProjects\\JD1\\HomeWork\\src\\home_work_6\\source\\Война и мир.txt";
        // читаем файл в строку с помощью класса Files
        try {
            String contents = readUsingFiles(fileName).trim();
            Set<String> set = new HashSet();
            Pattern pattern = Pattern.compile("([\\s+\\d-.();,!?:=\"]+)");
            String[] arr = pattern.split(contents);
            System.out.println("МАссив");

            for (String s : arr) {
                set.add(s.toLowerCase(Locale.ROOT));
                System.out.println(s);
            }
            Iterator<String> iterator = set.iterator();
            System.out.println("КОЛЛЕКЦИЯ");
            System.out.println("___________________________________");
            while (iterator.hasNext()) {
                System.out.println(iterator.next());

            }
            System.out.println("Количество слов в коллекции set: " + set.size());

        } catch (IOException e) {
            System.out.println("No files");
        }

    }

    /**
     * считавает из файла текст и преобразует в строку
     *
     * @param fileName файл
     * @return возвращает строку
     * @throws IOException пробрасывает обработку исключения в вызываемый метод
     */
    private static String readUsingFiles(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

}

