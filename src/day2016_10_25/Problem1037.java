package day2016_10_25;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int d[];
		int r;
		
		n = sc.nextInt();
		d = new int[n];
		for(int i=0; i<n; i++){
			d[i] = sc.nextInt();
		}
		
		Arrays.sort(d);
		r = d[0] * d[n-1];
		System.out.println(r);
	}
}