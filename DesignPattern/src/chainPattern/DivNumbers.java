package chainPattern;

public class DivNumbers implements Chain {

	private Chain nextInChain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;

	}

	@Override
	public double calculate(Numbers requests) {
		if (requests.getCalculationWanted() == "div") {
			// System.out.println(requests.getNumber1() + " / " + requests.getNumber2() +" =
			// "
			return (requests.getNumber1() / requests.getNumber2());
		} else {
			System.out.println("Only add, sub, mul and div are defined.");
			return -1.0005;
		}
		

	}

}
