package sinavOncesi;

public class NewDiamond {

	public static void main(String[] args) {
		int num = 5;
		
		
		for(int i = 0; i<num;i++) {
			for(int j = 0; j<num * 2 - 1; j++) {
				if(i > 0 && j < i || num*2-1-i <= j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");				
				}
			}
			System.out.println();
		}
		
		
	}

}
