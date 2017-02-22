package day2017_02_21;

import java.util.Scanner;

public class Problem4999 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String can = sc.nextLine();
		String want = sc.nextLine();
		
		boolean result = true;
		
		if(can.length() < want.length()){
			result = false;
		}
		
		if(result){
			System.out.println("go");
		}else{
			System.out.println("no");
		}
	}
}