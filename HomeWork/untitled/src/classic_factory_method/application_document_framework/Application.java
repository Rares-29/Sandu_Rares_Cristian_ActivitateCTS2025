package classic_factory_method.application_document_framework;

import java.util.ArrayList;
import java.util.List;

public abstract class Application {

    private List<Document> documentList = new ArrayList<>();



    public void newDocument() {
        //classic_factory_method.application_document_framework.Document doc = new classic_factory_method.application_document_framework.Document(); // you can't instatiate an abstract class / interface
        // do some business logic
        Document doc = createDocument();
        documentList.add(doc);
        // business
        // display GUI logic
    }

    protected abstract Document createDocument();
}
