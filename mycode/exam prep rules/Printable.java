public interface Printable {
    default void paste() {
        System.out.println("Default paste method");
    }
    
    int getPage();
}

class Document implements Printable {
    private int currentPage;
    
    public Document(int startPage) {
        this.currentPage = startPage;
    }
    
    @Override
    public int getPage() {
        return currentPage;
    }
    
    // Optional: Override the default paste method
    @Override
    public void paste() {
        System.out.println("Pasting content into the document");
    }
}

public class Main {
    public static void main(String[] args) {
        Document doc = new Document(1);
        System.out.println("Current page: " + doc.getPage());
        doc.paste();
    }
}