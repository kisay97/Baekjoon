package day2017_02_21;

import java.util.Scanner;

public class Problem1120 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String a = "";
		String b = "";
		char ch;
		
		int i;
		for (i=0; i<str.length(); i++) {
			ch = str.charAt(i);
			
			if (ch >= 0x61 && ch <= 0x7A) {
				a += ch;
			} else{
				i++;
				break;
			}
		}
		for ( ; i<str.length(); i++) {
			ch = str.charAt(i);
			
			if (ch >= 0x61 && ch <= 0x7A) {
				b += ch;
			} else
				break;
		}
		
		int minDifferent = 999;
		for (int start = 0; start < b.length()-a.length()+1; start++) {
			int differentCount = 0;
			
			for (int j=0; j<a.length(); j++) {
				if(a.charAt(j) != b.charAt(start+j)){
					differentCount++;
				}
			}
			
			minDifferent = (minDifferent>differentCount)? differentCount : minDifferent;
		}
		
		System.out.println(minDifferent);
	}
}