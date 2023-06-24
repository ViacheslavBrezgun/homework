//7.Написать новый класс с точкой входа. При запуске программы пользователь должен передать адрес папки,
// из которой мы будет считывать текстовые файлы. Наполнить данную директорию книгами, 100 книг мнинимум
package home_work_6;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BookGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите адрес папки:");
        String folderPath = scanner.nextLine();

        generateBooks(folderPath);
    }

    private static void generateBooks(String folderPath) {
        File folder = new File(folderPath);
        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Указанная папка не существует или не является директорией.");
            return;
        }

        for (int i = 1; i <= 100; i++) {
            String fileName = "book_" + i + ".txt";
            String content = "Содержимое книги номер " + i;

            try {
                File file = new File(folderPath, fileName);
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(content);
                bufferedWriter.close();
                System.out.println("Книга " + fileName + " создана.");
            } catch (IOException e) {
                System.out.println("Ошибка при создании книги " + fileName + ": " + e.getMessage());
            }
        }
    }
}


