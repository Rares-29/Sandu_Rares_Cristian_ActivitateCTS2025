package parameterized_factory_method.report;

public class UrbaReport implements Report{
    @Override
    public void save() {
        System.out.println("Saving urba report..");
    }

    @Override
    public void getContent() {

    }

    @Override
    public void getTitle() {

    }
}
