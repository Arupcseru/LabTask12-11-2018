package chainPattern;

public class AddNumbers implements Chain {
	private Chain nextInChain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain=nextChain;
		
	}

	@Override
	public double calculate(Numbers requests) {
		// TODO Auto-generated method stub
		if(requests.getCalculationWanted()=="add") {
			//System.out.println(requests.getNumber1() + " + " + requests.getNumber2() +" = "
			return (requests.getNumber1()+requests.getNumber2());
		}else {
			return nextInChain.calculate(requests);
		}
		
	}
	
}
