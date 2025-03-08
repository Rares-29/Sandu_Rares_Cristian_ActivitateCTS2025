package classic_factory_method.report;


import classic_factory_method.report.creator.DraReportService;
import classic_factory_method.report.creator.ReportService;
import classic_factory_method.report.creator.UrbaReportService;

public class Main {

    public static void main(String[] args) {

        // DraController

        //DraReportService
        // localhost:8080/generateDRA
        DraReportService draReportService = new DraReportService();
        draReportService.generateReport();
    }
}
