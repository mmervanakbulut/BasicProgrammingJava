package questions;


public class Q1 {

	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {
			System.out.print("A");
			int randomInt = (int)(Math.random() * 11);
			for(int j = 0; j<randomInt; j++) {
				System.out.print("_");
			}	
		}
		
			
		
	}

}
