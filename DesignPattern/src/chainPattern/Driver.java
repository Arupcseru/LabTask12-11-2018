package chainPattern;

public class Driver {

	public static void main(String[] args) {
		Chain chainCalc1=new AddNumbers();
		Chain chainCalc2=new SubNumbers();
		Chain chainCalc3=new MultyNumbers();
		Chain chainCalc4=new DivNumbers();
		
		chainCalc1.setNextChain(chainCalc2);
		chainCalc2.setNextChain(chainCalc3);
		chainCalc3.setNextChain(chainCalc4);
		
		
		
		Numbers requests=new Numbers(2.0,3.0,"mul");
		
		chainCalc1.calculate(requests);

	}

}
