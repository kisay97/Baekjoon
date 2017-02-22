package day2016_10_19;

import java.util.Scanner;

public class Problem8393 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int r=0;
		for(int i=1; i<=n; i++){
			r+=i;
		}
		
		System.out.println(r);
	}

}
