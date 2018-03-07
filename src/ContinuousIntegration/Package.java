package ContinuousIntegration;

import java.nio.channels.Pipe;

public class Package extends PipelineDecorator {

	public Package(PipeLine decoratedPipeline) {
		super(decoratedPipeline);
	}
	public void addPipeline(){
		decoratedPipeline.addPipeline();
		addPackage(decoratedPipeline);
	}

	private void addPackage(PipeLine decoratedPipeline) {
		System.out.println("added package");
	}

}