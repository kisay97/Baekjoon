package day2016_10_19;

import java.util.Scanner;

public class Problem9095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		int r[] = new int[t];
		for(int i=0; i<t; i++){
			int n;
			n = sc.nextInt();
			
			r[i] = f(n);
		}
		
		for(int i=0; i<t; i++){
			System.out.println(""+r[i]);
		}
	}
	
	public static int f(int n){
		if(n<0) return 0;
		else if(n==0) return 1;
		else return f(n-1)+f(n-2)+f(n-3);
	}
}