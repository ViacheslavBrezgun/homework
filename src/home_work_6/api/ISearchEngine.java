
package home_work_6.api;


public interface ISearchEngine {
    /**
     * метод нахождения колличества подобных слов в тексте
     *
     * @param text текст в котором осуществляем поиск
     * @param word искомое слово
     */
    long search(String text, String word);


}
