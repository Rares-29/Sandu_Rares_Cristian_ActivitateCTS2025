package parameterized_factory_method.report;

public class FullReport implements Report{
    @Override
    public void save() {
        System.out.println("Saving full report...");
    }

    @Override
    public void getContent() {

    }

    @Override
    public void getTitle() {

    }
}
