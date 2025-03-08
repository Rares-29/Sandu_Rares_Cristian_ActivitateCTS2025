package parameterized_factory_method.report;

public class ReportService {

    Report report;
    enum ReportType {
        DRA,FULL,URBA
    }

    // Centralised creation of different reports
    // Here we extend if we need another report
    public Report createReport(ReportType type) {
        return switch (type) {
            case DRA -> new DraReport();
            case FULL -> new FullReport();
            case URBA -> new UrbaReport();
        };
    }

    // You need this piece of code to work for all types of reports
    public void generateReportAndSaveToDb(ReportType type) {
        // get data from database
        // do some logs
        // validations
        Report report = createReport(type);
        this.report = report;
        report.save();
    }

    public void displayReport(ReportType type) {
        if (report == null) {
            Report report = createReport(type);
        }
        report.getContent();
        report.getTitle();
        // display
    }
}
