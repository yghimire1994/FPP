package Random;

public class Prog2 {

	public static void main(String[] args) {
		int x=RandomNumbers.getRandomInt(1,9);
		int y=RandomNumbers.getRandomInt(3,14);
		
		double resultX=Math.pow(Math.PI,x);
		double resultY=Math.pow(y, Math.PI);
		
		System.out.println("Result From X: "+resultX);
		System.out.println("Result From Y: "+resultY);
		
		
		

	}

}
