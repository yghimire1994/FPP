package eight;

public class Prog2_8 {

	
	 static int min(int[] arrayOfInts)
		{
			int minValue = arrayOfInts[0];
			  for(int i=1;i<arrayOfInts.length;i++){
			    if(arrayOfInts[i] < minValue){
				  minValue = arrayOfInts[i];
				}
			  }
			  return minValue;
		}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int [] numbers = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		int min=min(numbers);
		
		System.out.println("The minnimum num is"+min);

	}

}
