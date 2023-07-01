package home_work_6.utils;

import home_work_6.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer extends EngineDecorator {

    public SearchEnginePunctuationNormalizer(ISearchEngine decorated) {
        super(decorated);
    }

    /**
     * метод нахождения колличества подобных слов в тексте
     * @param text текст в котором осуществляем поиск
     * @param word искомое слово
     * @return колличество встреч слова
     */
    @Override
    public long search(String text, String word) {
        SearchPunctuationNormalizer(text, word);
        return 1;
    }

    /**
     *декоратор убирает из текста запятые
     * @param text текст книги
     * @param word убираемый символ
     * @return отформатированную строку по заданному параметру
     */
    private String SearchPunctuationNormalizer(String text, String word) {
        String text1 = text.replace(word, "");
        System.out.println(text1);
        return text1;


    }


}

