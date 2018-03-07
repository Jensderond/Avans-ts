package Reporting;

public class Header extends TemplateDecorator {
    public Header(Report decoratedReport) {
        super(decoratedReport);
    }

    @Override
    public void decorateReport(){
        decoratedReport.decorateReport();
        setHeader(decoratedReport);
    }

    private void setHeader(Report decoratedReport){
        System.out.println("added header");
    }
}