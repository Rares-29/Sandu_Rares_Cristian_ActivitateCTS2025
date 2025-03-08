package classic_factory_method.report.creator;

import classic_factory_method.report.product.Report;
import classic_factory_method.report.product.UrbaReport;

public class UrbaReportService extends ReportService {


    @Override
    public Report createReport() {
        return new UrbaReport();
    }
}
