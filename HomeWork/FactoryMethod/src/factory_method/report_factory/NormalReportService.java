package factory_method.report_factory;

import factory_method.report_types.FullReportTypes;
import factory_method.report_types.NormalReportTypes;
import factory_method.report_types.ReportType;
import factory_method.reports.*;

public class NormalReportService extends ReportService {


    @Override
    public Report createReport(ReportType reportType) {
        NormalReportTypes fullReportTypes = (NormalReportTypes) reportType;
        switch(fullReportTypes) {
            case DRA ->  {
                return new DraReport();
            }
            case SNAPSHOT -> {
                return new SnapshotReport();
            }
            default -> {
                throw new IllegalArgumentException();
            }
        }
    }


}
