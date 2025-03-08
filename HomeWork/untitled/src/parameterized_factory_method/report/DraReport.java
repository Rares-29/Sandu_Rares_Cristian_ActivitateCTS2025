package parameterized_factory_method.report;

public class DraReport implements Report{
    @Override
    public void save() {
        System.out.println("Saving dra report...");
    }

    @Override
    public void getContent() {

    }

    @Override
    public void getTitle() {

    }
}
