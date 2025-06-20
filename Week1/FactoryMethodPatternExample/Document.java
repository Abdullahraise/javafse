package DeepSkilling.FactoryMethodPatternExample;

public interface Document {

   public abstract void open();
}
class PdfDocument implements Document{
{
    System.out.println("Created pdf file");
}
     @Override
     public void open() {
         System.out.println("opening pdf");
     }
}

class ExcelDocument implements Document  {
    {
        System.out.println("Created Excel file");
    }
@Override
public void open() {
    System.out.println("Opening Excel...");
}
}
 class WordDocument implements Document {
    {
        System.out.println("Created Word file");
    }
    @Override
    public void open() {
        System.out.println("Opening Word");
    }
}