package seventh;

/**
 *  As a hint to Prog9, try running this code and
 *  then examine how it works.
 */

public class Prog7 {
	
	public static int getRandom() {
		return RandomNumbers.getRandomInt(1,99);
	}

	
	public static void main(String[] args){
		
					String output = "";
		
		output = String.format("%16d %12d %12d %12d %n %n", getRandom(), getRandom(), getRandom(), getRandom());
		output += String.format("%13s %2d %9s %2d %9s %2d %9s %2d %n","+", getRandom(), "+", getRandom(), "+", getRandom(), "+", getRandom());
		output += String.format("%16s %12s %12s %12s","__", "__","__", "__");
		
		output += String.format("%n %n %n %n %n %n");
		
		output += String.format("%16d %12d %12d %12d %n %n", getRandom(), getRandom(), getRandom(), getRandom());
		output += String.format("%13s %2d %9s %2d %9s %2d %9s %2d %n","+", getRandom(), "+", getRandom(), "+", getRandom(), "+", getRandom());
		output += String.format("%16s %12s %12s %12s","__", "__","__", "__");
		
		System.out.println(output);
	}
	
}