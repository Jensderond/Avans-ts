package ContinuousIntegration;

public class Deploy extends PipelineDecorator {

	public Deploy(PipeLine decoratedPipeline) {
		super(decoratedPipeline);
	}

	public void addPipeline(){
		decoratedPipeline.addPipeline();
		addDeploy(decoratedPipeline);
	}

	private void addDeploy(PipeLine decoratedPipeline) {
		System.out.println("added deploy");
	}
}