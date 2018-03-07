package ContinuousIntegration;

public abstract class PipelineDecorator extends PipeLine {
    PipeLine decoratedPipeline;

    PipelineDecorator(PipeLine decoratedPipeline){
        this.decoratedPipeline = decoratedPipeline;
    }

    public void addPipeline(){
        decoratedPipeline.addPipeline();
    }
}