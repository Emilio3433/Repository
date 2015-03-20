
public class TestCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coin side = new Coin();
		
		for(int j=0;j<20;j++){
			side.toss();
		}
		System.out.println(side.getsideUp());
	}

}
