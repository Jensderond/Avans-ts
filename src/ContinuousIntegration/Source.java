package ContinuousIntegration;

public class Source extends PipelineDecorator {

	public Source(PipeLine decoratedPipeline) {
		super(decoratedPipeline);
	}
	public void addPipeline(){
		decoratedPipeline.addPipeline();
		addSource(decoratedPipeline);
	}

	private void addSource(PipeLine decoratedPipeline) {
		System.out.println("added source to pipeline");
	}

}