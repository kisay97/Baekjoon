package day2016_10_19;

import java.util.Scanner;

public class Problem9498 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		if(n>=90 && n<=100)
			System.out.println("A");
		else if(n>=80 && n<=89)
			System.out.println("B");
		else if(n>=70 && n<=79)
			System.out.println("C");
		else if(n>=60 && n<=69)
			System.out.println("D");
		else
			System.out.println("F");
	}
}