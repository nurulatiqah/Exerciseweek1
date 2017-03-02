package e78;

/**
 * @author nurulatiqahali
 *
 */
public class E784BoundedCounter {
	private int value;
	private int upperLimit;

	public E784BoundedCounter(int upperLimit) {
		this.upperLimit = upperLimit;
	}

	public void setValue(int s) {
		value = s; //console

	}

	public int getValue() {

		return this.value; 
	}

	public void next() {
		value++;
		if (value > upperLimit) {
			value = 0; // advanced for minutes,hours,seconds
		}
	}

	public String toString() {
		return String.format("%02d", value); //00 format
	}

}
