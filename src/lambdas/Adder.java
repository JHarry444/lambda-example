package lambdas;

// massive overkill
public class Adder implements Calculation {

	@Override
	public int calculate(int num1, int num2) {
		return num1 + num2;
	}
}
