package day2017_02_14;

import java.util.Scanner;

public class Problem1075 {
	public static void main(String[] args) {
		int n,f;
		String result = "";
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		f = sc.nextInt();
		
		n /= 100;
		n *= 100;
		
		while(n % f != 0) {
			n++;
		}
		
		result += (n%100);
		
		while(result.length() < 2) {
			result = "0".concat(result);
		}
		
		System.out.println(result);
	}
}