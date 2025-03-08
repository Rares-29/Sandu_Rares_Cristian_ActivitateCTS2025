package classic_factory_method.report.creator;

import classic_factory_method.report.product.FullReport;
import classic_factory_method.report.product.Report;

public class FullReportService extends ReportService {
    @Override
    public Report createReport() {
        return new FullReport();
    }
}
