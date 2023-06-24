//2.2 Найти в тексте топ N (настраиваемое значение) слов и вывести количество этих слов используя Map и List. Отсортировать по количеству. Распечатать в консоль.
//	Пример: Война - 200 раз, Мир - 100 раз и так далее. Знаки препинания, пробелы и переводы строк - это не слова.
//	Более подробное описание задачи, для понимания чего я хочу: Для решения данной задачи необходимо прочитать текстовый файл  и поместить текст из данного текстового файла в строку.
//	Далее данную строку необходимо обработать таким образом чтобы из неё можно было бы считывать слова. Далее каждое полученное слово поместить как ключ в Map, а количество повторений в тексте ставить как значение.
//	Для того чтобы это работало вам необходимо постоянно проверять наличие ключа в Map, и если нужный нам ключ уже присутсвует в нашей коллекции то мы должны увеличить уже имеющееся значение в коллекции на еденицу.
//	После наполнения данной коллекции мы получим набор слов и их количество в тексте. Далее нам нужно придумать как отсортировать получившуюся коллекцию но к сожалению
//	непосредственно эту коллекцию отсортировать не получится, придётся создавать для этого List и наполнять лист Entry из Map.
//	В итоге из получившегося отсортированного набора данных вывести первые N записей.

package home_work_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main3 {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    public static void main(String[] args) {

        /////// 2.2 Найти в тексте топ N (настраиваемое значение) слов и вывести количество этих слов используя Map и List.
        Set<String> set = new HashSet<String>();
        Map map = new HashMap<>();
        int count = 1;
        int count2 = 0;
        try {
            BufferedReader text = new BufferedReader(new FileReader("src/Война и мир.txt")); // чтение текста с файла
            String st = "";
            String st1 = "";
            while ((st = text.readLine()) != null) { //проверяем построчно есть ли заполненная строка теста и сохраняем эту строку в st
                StringTokenizer tokenizer = new StringTokenizer(st, " .!?(){}[]<>#*,:;-\'\"/"); //раскладывает строку на части - слова по делиметру
                while (tokenizer.hasMoreTokens()) {  // функция наличия слов-лексем
                    String ff = tokenizer.nextToken().toLowerCase(); //строка текста

                    if (map.containsKey(ff)) {
                        count2 = (int) map.get(ff);
                        map.put(ff, ++count2);// записываем слова на корорые указывает токенайзер в сет и преобразуем в нижний регистр
                    } else
                        map.put(ff, count);
                }
            }
        } catch (IOException e) {
            System.err.println("Нет такого файла");
        }

        System.out.println(map.entrySet().toString());
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        System.out.println("Лист");

        Iterator<Map.Entry<String, Integer>> it1 = list.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
        ComparatorList comparatorList = new ComparatorList();
        Collections.sort(list, comparatorList);
        System.out.println("Лист");
        System.out.println(list.toString());
        System.out.println("Топ 10..................");
        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i));
        }

        ///   3,3.1., 4.1.  Информация о количестве раз которое встречается в тексте. Метод IndexOf
        EasySearch iSearchEngine = new EasySearch();
        StringBuilder st = returnText();
        long number = iSearchEngine.search(st.toString(), "Начало");

        ///   4.2. Информация о количестве раз которое встречается в тексте c помощью Mather

        RegExSearch regExSearch = new RegExSearch();
        StringBuilder st1 = returnText();
        long number1 = regExSearch.search(st1.toString(), "Начало");

        //Декоратор

        ISearchEngine punctuationNormalizer = new SearchEnginePunctuationNormalizer(new EasySearch());
        System.out.println("decorator");
        StringBuilder st2 = returnText();
        punctuationNormalizer.search(st2.toString(), ",");

    }

    //Метод считывания текста из файла и помещение его в строку
    public static StringBuilder returnText() {
        StringBuilder st = new StringBuilder();
        try {
            BufferedReader text2 = new BufferedReader(new FileReader("src/Война и мир.txt")); // чтение текста с файла

            while ((text2.readLine()) != null) {
                st.append(text2.readLine());
            }
        } catch (IOException e) {
            System.err.println("Нет такого файла");
        }
        return st;
    }


}


