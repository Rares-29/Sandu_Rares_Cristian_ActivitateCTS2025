package factory_method.reports;

public class SnapshotReport implements Report{

    public void saveInDb() {
        System.out.println("Saving Snapshot report in db..");
    }
}
