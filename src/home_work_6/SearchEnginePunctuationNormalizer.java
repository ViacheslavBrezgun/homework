package home_work_6;

public class SearchEnginePunctuationNormalizer extends EngineDecorator{

    public SearchEnginePunctuationNormalizer(ISearchEngine decorated) {
        super(decorated);
    }

    @Override
    public long search(String text, String word) {
        SearchPunctuationNormalizer(text,word);
        return 1;
    }

    private String SearchPunctuationNormalizer(String text, String word) {
    String text1=text.replace(",","");
        System.out.println(text1);
    return text1;


    }



}

