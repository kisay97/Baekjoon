package day2017_02_17;

import java.util.Scanner;

public class Problem1094 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int result = 0;
		
		int makdae = 64;
		while(true){
			if(makdae > x){
				makdae /= 2;
			}
			else{
				x -= makdae;
				result++;
			}
			
			if(x == 0) break;
		}
		
		System.out.println(result);
	}
}