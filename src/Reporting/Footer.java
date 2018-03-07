package Reporting;

public class Footer extends TemplateDecorator {
    public Footer(Report decoratedReport) {
        super(decoratedReport);
    }

    @Override
    public void decorateReport(){
        decoratedReport.decorateReport();
        setFooter(decoratedReport);
    }

    private void setFooter(Report decoratedReport){
        System.out.println("added footer");
    }
}