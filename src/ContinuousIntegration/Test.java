package ContinuousIntegration;

public class Test extends PipelineDecorator {

	public Test(PipeLine decoratedPipeline) {
		super(decoratedPipeline);
	}
	public void addPipeline(){
		decoratedPipeline.addPipeline();
		addTest(decoratedPipeline);
	}

	private void addTest(PipeLine decoratedPipeline) {
		System.out.println("added test");
	}
}