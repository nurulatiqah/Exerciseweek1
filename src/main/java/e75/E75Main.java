package e75;

/**
 * @author nurulatiqahali
 *
 */
public class E75Main {
	public static void main(String[] args) {
		DecreasingCounter counter = new DecreasingCounter(10);// Exercise75.1=10;
																	// Exercise75.2=2;
		counter.printValue();

		counter.decrease();
		counter.printValue();
		counter.decrease();
		counter.printValue();
	}
}
