package factory_method.report_factory;

import factory_method.report_types.FullReportTypes;
import factory_method.report_types.ReportType;
import factory_method.reports.FullReport;
import factory_method.reports.FullUrbaReport;
import factory_method.reports.Report;

public class FullReportService extends ReportService {


    @Override
    public Report createReport(ReportType reportType) {
        FullReportTypes fullReportTypes = (FullReportTypes) reportType;
        switch(fullReportTypes) {
            case FULL_REPORT ->  {
                return new FullReport();
            }
            case FULL_URBA -> {
                return new FullUrbaReport();
            }
            default -> {
                throw new IllegalArgumentException();
            }
        }
    }
}
