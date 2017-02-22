package day2016_10_19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem11399 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		for(int i=0; i<n; i++){
			int input = sc.nextInt();
			list.add(input);
		}
		
		
		int r = 0;
		Collections.sort(list);
		
		for(int i=0; i<n; i++){
			for(int j=0; j<=i; j++){
				r += list.get(j);
			}
		}
		
		System.out.println(r);
	}
}