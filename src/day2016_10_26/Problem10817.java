package day2016_10_26;

import java.util.Scanner;

public class Problem10817 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a==b && b==c) System.out.println(a);
		else if(a==b || a==c){
			System.out.println(a);
		}else if(b==c){
			System.out.println(b);
		}else{
			if((a>b&&a<c) || (a>c&&a<b)) System.out.println(a);
			else if((b>a&&b<c) || (b>c&&b<a)) System.out.println(b);
			else System.out.println(c);
		}
	}
}