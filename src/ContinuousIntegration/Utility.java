package ContinuousIntegration;

public class Utility extends PipelineDecorator {

	public Utility(PipeLine decoratedPipeline) {
		super(decoratedPipeline);
	}

	public void addPipeline(){
		decoratedPipeline.addPipeline();
		addUtility(decoratedPipeline);
	}

	private void addUtility(PipeLine decoratedPipeline) {
		System.out.println("added utility");
	}
}