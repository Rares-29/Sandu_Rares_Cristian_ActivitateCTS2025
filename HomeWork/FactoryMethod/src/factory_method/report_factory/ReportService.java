package factory_method.report_factory;

import factory_method.report_types.ReportType;
import factory_method.reports.Report;

public abstract class ReportService {

    public abstract Report createReport(ReportType reportType);
    public void doOperation(ReportType reportType) {
        Report report = createReport(reportType);
        report.saveInDb();
    }
}
