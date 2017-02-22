package day2016_10_19;

import java.util.Scanner;

public class Problem2739 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		
		for(int i=1; i<=9; i++){
			System.out.println(n + " * " + i + " = " + (n*i));
		}
	}
}