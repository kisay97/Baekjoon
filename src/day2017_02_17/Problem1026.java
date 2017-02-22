package day2017_02_17;

import java.util.Scanner;

public class Problem1026 {
	//arr에서 작은 순서대로 순위를 리턴
	public static int whatRank(int arr[], int arrSize, int index){
		int rank = 0;
		
		int criterion = arr[index];
		
		for(int i=0; i<arrSize; i++){
			if(i == index) continue;
			if(arr[i] < criterion){
				rank++;
			}
			else if(arr[i] == criterion && i < index){
				rank++;
			}
		}
		
		return rank;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s = 0;
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++){
			b[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(whatRank(a, n, i) == ((n-1)-whatRank(b, n, j))){
					s += a[i]*b[j];
					break;
				}
			}
		}
		
		System.out.println(s);
	}
}