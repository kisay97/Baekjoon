package day2017_02_15;

import java.util.Scanner;

public class Problem1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y,w,h;
		int result;
		
		x = sc.nextInt();
		y = sc.nextInt();
		w = sc.nextInt();
		h = sc.nextInt();
		
		int a,b;
		a = ( (w-x) >= (x) ) ? x : (w-x);
		b = ( (h-y) >= (y) ) ? y : (h-y);
		result = ( a >= b ) ? b : a;
		
		System.out.println(result);
	}
}