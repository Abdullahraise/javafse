package DeepSkilling.FactoryMethodPatternExample;

public class Test {
    public static void main(String[] args) {
        Document word=new WordDocument();
        word.open();
        Document excel=new ExcelDocument();
        excel.open();
        Document pdf=new PdfDocument();
        pdf.open();
    }
}
