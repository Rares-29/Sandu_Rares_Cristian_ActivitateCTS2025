package classic_factory_method.application_document_framework;

public class DrawingApplication extends Application{

    @Override
    protected Document createDocument() {
        return new DrawingDocument();
    }
}
