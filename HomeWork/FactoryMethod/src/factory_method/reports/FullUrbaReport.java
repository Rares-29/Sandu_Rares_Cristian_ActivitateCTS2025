package factory_method.reports;

public class FullUrbaReport implements Report{


    public void saveInDb() {
        System.out.println("Saving full urba report in db..");
    }
}
