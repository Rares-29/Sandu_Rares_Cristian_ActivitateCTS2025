package classic_factory_method.report.creator;

import classic_factory_method.report.product.DraReport;
import classic_factory_method.report.product.Report;

public class DraReportService extends ReportService {
    @Override
    public Report createReport() {
        return new DraReport();
    }
}
