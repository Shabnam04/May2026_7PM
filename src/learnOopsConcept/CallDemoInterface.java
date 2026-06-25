package learnOopsConcept;

public class CallDemoInterface implements DemoInterface
{

	@Override
	public void meth3() {
		
		System.out.println("this is method3");
	}

	@Override
	public void meth4() {
		System.out.println("this is method3");
		
	}

	
	public static void main(String[] args) {
		CallDemoInterface cdi = new CallDemoInterface();
		cdi.meth3();
		cdi.meth4();
	}
	
}
