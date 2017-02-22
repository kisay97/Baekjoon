package day2016_10_19;

import java.util.Scanner;

public class Problem10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n,x;
		int a[];
		n = sc.nextInt();
		x = sc.nextInt();
		
		a = new int[n];
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++){
			if(a[i] < x) System.out.print(a[i] + " ");
		}
	}

}
