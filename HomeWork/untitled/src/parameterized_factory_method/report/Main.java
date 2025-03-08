package parameterized_factory_method.report;

public class Main {

    public static void main(String[] args) {
        ReportService reportService = new ReportService();

        // endpoint /createDRA
        reportService.generateReportAndSaveToDb(ReportService.ReportType.DRA);

        // endpoint /createFull
        reportService.generateReportAndSaveToDb(ReportService.ReportType.FULL);
    }
}
