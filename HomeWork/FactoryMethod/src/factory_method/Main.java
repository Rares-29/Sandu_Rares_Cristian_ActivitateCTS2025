package factory_method;

import factory_method.report_factory.FullReportService;
import factory_method.report_factory.ReportService;
import factory_method.report_types.FullReportTypes;
import factory_method.report_types.ReportType;

public class Main {
    public static void main(String[] args) {

        ReportService reportService = new FullReportService();
        reportService.doOperation(FullReportTypes.FULL_URBA);
    }
}