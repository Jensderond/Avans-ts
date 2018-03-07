package Reporting;

public abstract class TemplateDecorator extends Report {
    Report decoratedReport;

    TemplateDecorator(Report decoratedReport){
        this.decoratedReport = decoratedReport;
    }

    public void decorateReport(){
        decoratedReport.decorateReport();
    }
}