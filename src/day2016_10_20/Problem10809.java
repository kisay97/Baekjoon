package day2016_10_20;

import java.util.Scanner;

public class Problem10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		char alphabat[] = {'a','b','c','d','e','f','g',
						   'h','i','j','k','l','m','n',
						   'o','p','q','r','s','t','u',
						   'v','w','x','y','z'};
		
		s = sc.nextLine();
		
		boolean t;
		
		for(int i=0; i<alphabat.length; i++){
			t = true;
			for(int j=0; j<s.length(); j++){
				if(s.charAt(j) == alphabat[i]){
					System.out.print(j + " ");
					t = false;
					break;
				}
			}
			if(t){
				System.out.print("-1 ");
			}
		}
	}
}