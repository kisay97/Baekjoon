package day2016_06_29;

import java.util.Scanner;

public class Problem2605 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int student = sc.nextInt();
		int rank[] = new int[student];
		int studentNumber[] = new int[student];
		
		for(int i=0; i<student; i++){
			studentNumber[i] = sc.nextInt();
			rank[i] = 0;
		}
		
		for(int i=1; i<student; i++){
			rank[i] = i;
			int nowRank = i;
			
			while(!(studentNumber[i] == 0)){
				studentNumber[i]--;
				
				
				//swap
				int temp = rank[nowRank];
				rank[nowRank] = rank[nowRank-1];
				rank[nowRank-1] = temp;
				
				nowRank--;
			}
		}
		
		for(int i=0; i<rank.length; i++){
			System.out.print(++rank[i] + " ");
		}
	}
}