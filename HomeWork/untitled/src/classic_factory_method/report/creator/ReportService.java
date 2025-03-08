package classic_factory_method.report.creator;

import classic_factory_method.report.product.FullReport;
import classic_factory_method.report.product.Report;
import classic_factory_method.report.product.UrbaReport;

public abstract class ReportService {


    // delegates the responsability for object creation to
    // the subclasses
    public abstract Report createReport();


    // You need this piece of code to work for all types of reports
    public void generateReport() {
        // get data from database
        // do some logs
        // validations;
        Report report = createReport();
        report.save();

    }
}
