package classic_factory_method.application_document_framework;

public class DrawingDocument implements Document{
    @Override
    public void open() {
        System.out.println("Showing on the screen the drawing document");
    }

    @Override
    public void save() {
        System.out.println("Save the drawing document to fs");
    }

    @Override
    public void close() {
        System.out.println("Close the drawing document");
    }
}
