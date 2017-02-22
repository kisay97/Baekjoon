package day2016_10_19;

import java.util.Scanner;

public class Problem11727 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		
		int d[] = new int[1000];
		d[0]=1;
		d[1]=3;
		for(int i=2; i<n; i++){
			d[i] = ( d[i-1] + (d[i-2] * 2) ) % 10007;
		}
		
		System.out.println(d[n-1]);
	}
}