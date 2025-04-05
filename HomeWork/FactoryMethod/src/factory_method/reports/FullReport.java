package factory_method.reports;

public class FullReport  implements Report{

    public void saveInDb() {
        System.out.println("Saving Full report in db..");
    }

}
