package ContinuousIntegration;

public class Build extends PipelineDecorator {

	public Build(PipeLine decoratedPipeline) {
		super(decoratedPipeline);
	}

	public void addPipeline(){
		decoratedPipeline.addPipeline();
		addBuild(decoratedPipeline);
	}

	private void addBuild(PipeLine decoratedPipeline) {
        System.out.println("added build");
	}

}