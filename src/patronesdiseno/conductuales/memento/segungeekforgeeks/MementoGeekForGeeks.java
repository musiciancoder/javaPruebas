package patronesdiseno.conductuales.memento.segungeekforgeeks;



import java.util.ArrayList;
        import java.util.List;

// Originator
class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public void write(String text) {
        this.content += text;
    }

    public String getContent() {
        return this.content;
    }

    public DocumentMemento createMemento() {
        return new DocumentMemento(this.content);
    }

    public void restoreFromMemento(DocumentMemento memento) {
        this.content = memento.getSavedContent();
    }
}

// Memento
class DocumentMemento {
    private String content;

    public DocumentMemento(String content) {
        this.content = content;
    }

    public String getSavedContent() {
        return this.content;
    }
}

// Caretaker
class History {
    private List<DocumentMemento> mementos;

    public History() {
        this.mementos = new ArrayList<>();
    }

    public void addMemento(DocumentMemento memento) {
        this.mementos.add(memento);
    }

    public DocumentMemento getMemento(int index) {
        return this.mementos.get(index);
    }
}

public class MementoGeekForGeeks {
    public static void main(String[] args) {
        Document document = new Document("Initial content\n");
        History history = new History();

        System.out.println(document.getContent());

        // Write some content
        document.write("Additional content\n");
        history.addMemento(document.createMemento());

        System.out.println(document.getContent());

        // Write more content
        document.write("More content\n");
        history.addMemento(document.createMemento());

        System.out.println(document.getContent());

        // Restore to previous state
        document.restoreFromMemento(history.getMemento(0)); //Notar que con 0  volvemos a "Additional content\n" , o sea al primero que agregamos  con write, pero no a "Initial content\n" que es el estado inicial y al parecer no podemos volver a él ya q se setea por  defecto

        // Print document content
        System.out.println(document.getContent());
    }
}

