public class Coin {
	private String side;

	public Coin() { // constructor

		sideUp("Tails");

	}

	public String sideUp(String side) {
		if (side.compareTo("Heads") == 0) {
			return "Heads";
		} else
			return "Tails";

	}

	public void toss() {
		int rand = (int) (Math.random() * 2 + 1);
		switch (rand) {
		case 1:
			side = "Heads";
			break;
		case 2:
			side = "Tails";
			break;
		}

	}

	public String getsideUp() {
		return side;

	}

}