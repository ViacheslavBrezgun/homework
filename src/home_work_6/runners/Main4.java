package home_work_6.runners;

import java.io.*;
import java.util.Scanner;


public class Main4 {
    public static void main(String[] args) throws IOException {
        //   Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите адрес папки:");
//        String folderPath1 = scanner.nextLine();
        menuBook(); // вызов меню
    }
    private static void menuBook() throws IOException {

        File file = new File( "src\\home_work_6\\source"); // обращение к файлу
//        if (file.exists() && file.isDirectory()) {
//            System.out.println("файл есть");
//        }

        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            System.out.println(i + 1 + "." + files[i].getPath()); // вывод в консоль содержание файла book (book1.txt, и т.д.)
        }
        System.out.println("0.Выход из меню");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите файл:");
        System.out.println();
        String sc = scanner.nextLine();
        //  String folderPath = scanner.nextLine();
        // generateBooks(folderPath);
        switch (sc) {
            case "1": {
                int d = generateBooks(file.getPath() + "\\book1.txt"); // вызов метода generateBooks и передача пути к текстовому файлу
            }
            break;
            case "2": {
                generateBooks(file.getPath() + "\\book2.txt");
            }
            break;
            case "3": {
                generateBooks(file.getPath() + "\\book3.txt");
            }
            break;
            case "4": {
                generateBooks(file.getPath() + "\\Война и мир.txt");
            }
            case "0": {
                System.out.println("Выход");
                break;
            }
        }
    }
    private static int generateBooks(String folderPath) throws IOException { // метод поиска слов в файле и запись результатов поиска
        File file2 = new File(folderPath); // folderPath - путь к файлу который был передан из case
        File file1 = new File("src\\result.txt"); // файл результата
        int poz = 0;
        int col = 0;
        String st1 = null;

        do {
            System.out.println("Введите искомое слово, для возврата в меню нажмите 0: ");
            Scanner scanner = new Scanner(System.in);

            st1 = scanner.next();
            if ((st1.equals("0")) == false) { // если не выбрано 0
                BufferedReader br = new BufferedReader(new FileReader(file2)); // считывание файла
                String st;
                int number = 0;
                while ((st = br.readLine()) != null) { // проверка построчно
                    poz = st.indexOf(st1); // поиска слова
                    number++;
                    if (poz >= 0) {
                        System.out.println("Найдено в строке " + number);
                        col++;
                    }
                }
                try (BufferedWriter writer = new BufferedWriter(new
                        FileWriter("result.txt", true))) {
                    writer.write(file2.getName()+" - "+st1 + " - " + col);// запись в файл result результата
                    writer.newLine();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            } else
                menuBook(); // если выбрано 0 вызывается метод menuBook() прорисовки меню

        } while (!st1.equals("0"));

        return 0;
    }


}
