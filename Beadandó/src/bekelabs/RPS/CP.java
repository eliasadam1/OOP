package bekelabs.RPS;

import java.util.Random;

public class CP extends GameItems {
	private Random number;

	public CP() {
		super();
		number = new Random();
	}

	public choices getCpChoice() {
		int choice = 1 + number.nextInt(3);

		switch (choice) {
		case 1:
			return choices.K�;
		case 2:
			return choices.Pap�r;
		}
		return choices.Oll�;
	}

}
