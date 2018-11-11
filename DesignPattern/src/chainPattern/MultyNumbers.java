package chainPattern;

public class MultyNumbers implements Chain {

	private Chain nextInChain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;

	}

	@Override
	public double calculate(Numbers requests) {
		if (requests.getCalculationWanted() == "mul") {
			// System.out.println(requests.getNumber1() + " x " + requests.getNumber2() +" =
			// "
			return requests.getNumber1() * requests.getNumber2();
		} else {
			return nextInChain.calculate(requests);
		}
	}

}
