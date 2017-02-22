package day2016_10_19;

public class Problem4673 {

	public static void main(String[] args) {
		boolean isSelf[] = new boolean[10000];
		for(int i=0; i<10000; i++){
			isSelf[i] = true;
		}
		
		for(int i=0; i<10000; i++){
			findNotSelf(i, isSelf);
		}
		
		for(int i=0; i<10000; i++){
			if(isSelf[i]) 
				System.out.println("" + (i+1));
		}
	}
	
	public static void findNotSelf(int index, boolean []isSelf){
		int n = index+1;
		while(n<=10000){
			String nStr = ""+n;
			int re = n;
			for(int i=0; i<nStr.length(); i++){
				re += Integer.parseInt(""+nStr.charAt(i));
			}
			
			if(re <= 10000){
				isSelf[re-1] = false;
			}
			n = re;
		}
	}
}