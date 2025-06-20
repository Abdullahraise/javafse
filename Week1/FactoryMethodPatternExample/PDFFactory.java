package DeepSkilling.FactoryMethodPatternExample;

public class PDFFactory extends PdfDocument{
    Document createPDF(){
        return new PdfDocument();
    }
}
