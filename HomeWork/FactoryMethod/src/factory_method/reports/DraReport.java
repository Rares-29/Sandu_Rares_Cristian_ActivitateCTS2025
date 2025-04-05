package factory_method.reports;

public class DraReport implements Report{

    public void saveInDb() {
        System.out.println("Saving Dra report in db..");
    }
}
