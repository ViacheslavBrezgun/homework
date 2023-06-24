package home_work_6;

public abstract class EngineDecorator implements ISearchEngine{
    protected ISearchEngine decorated;

    public EngineDecorator(ISearchEngine decorated) {
        this.decorated = decorated;
    }

   public long search(String text,String word){
       long textEngine = decorated.search(text,word);
       return textEngine;
    }
}
