package day2017_02_17;

import java.util.Scanner;

public class Problem1100 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		
		boolean chessPan[][] = new boolean[8][8];
		boolean kan;
		for (int i = 0; i < chessPan.length; i++) {
			if((i%2) == 0) kan = true;
			else kan = false;
			for (int j = 0; j < chessPan[i].length; j++) {
				chessPan[i][j] = kan;
				kan = !kan;
			}
		}
		
		boolean chessMal[][] = new boolean[8][8];
		String inputMal;
		char mal;
		for (int i = 0; i < chessMal.length; i++) {
			inputMal = sc.nextLine();
			for (int j = 0; j < chessMal[i].length; j++) {
				mal = inputMal.charAt(j);
				if(mal == '.'){
					chessMal[i][j] = false;
				}
				else if(mal == 'F'){
					chessMal[i][j] = true;
				}
				else{
					j--;
				}
			}
		}
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if(chessPan[i][j] && chessMal[i][j]) result++;
			}
		}
		
		System.out.println(result);
	}
}