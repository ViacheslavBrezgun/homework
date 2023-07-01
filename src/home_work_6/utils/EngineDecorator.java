package home_work_6.utils;

import home_work_6.api.ISearchEngine;

public abstract class EngineDecorator implements ISearchEngine {
    protected ISearchEngine decorated;

    public EngineDecorator(ISearchEngine decorated) {
        this.decorated = decorated;
    }

    /**
     *метод нахождения колличества подобных слов в тексте
     * @param text текст в котором осуществляем поиск
     * @param word искомое слово
     * @return количество слов
     */
    public long search(String text, String word) {
        long textEngine = decorated.search(text, word);
        return textEngine;
    }
}
