package sixth;


public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] testData= {"horse","horse", "dog", "cat", "horse","dog"};
		StringBuffer result = Prog6.removeDups(testData);
		System.out.println(result);
		
		
		
	}
	public static StringBuffer removeDups(String[] str) {
		StringBuffer store=new StringBuffer("[");
		
		for(int i=0;i<str.length;++i) {
			int n=store.indexOf(str[i]);
			
			if(n<0) {
			
					store.append(str[i]+",");	
			}
		}
		int len=store.length();
		store=store.deleteCharAt(len-1);
	return store.append("]");
	}



}
