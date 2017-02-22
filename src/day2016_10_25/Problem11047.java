package day2016_10_25;

import java.util.Scanner;

public class Problem11047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,k,r=0;
		n = sc.nextInt();
		k = sc.nextInt();
		
		int v[] = new int[n];
				
		for(int i=0; i<n; i++){
			v[i] = sc.nextInt();
		}
		
		for(int i=n-1; i>=0; i--){
			if(k == 0) break;
			while(v[i] <= k){
				k-=v[i];
				r++;
			}
		}
		
		System.out.println(r);
	}
}