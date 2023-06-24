//3.1 Поиск используя метод IndexOf
package home_work_6;

public class EasySearch implements ISearchEngine {
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


