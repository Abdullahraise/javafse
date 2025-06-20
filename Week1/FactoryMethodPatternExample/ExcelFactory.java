package DeepSkilling.FactoryMethodPatternExample;

public class ExcelFactory extends ExcelDocument{
    Document CreateExcel(){
        return new ExcelDocument();
    }
}
