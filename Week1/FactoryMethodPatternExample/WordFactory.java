package DeepSkilling.FactoryMethodPatternExample;

public class WordFactory extends WordDocument {
    Document CreateWord(){
        return new WordDocument();
    }
}
