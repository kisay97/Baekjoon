package day2016_10_19;

import java.util.Scanner;

public class Problem2440 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		
		for(int i=n; i>0; i--){
			for(int j=0; j<i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}