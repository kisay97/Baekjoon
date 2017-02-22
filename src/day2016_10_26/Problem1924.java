package day2016_10_26;

import java.util.Scanner;

public class Problem1924 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y;
		x = sc.nextInt();
		y = sc.nextInt();
		
		int day = 1; //0은 일요일, 6은 토요일, 월요일부터 시작
		
		while( !(x==1 && y==1) ){
			y--;
			day++;
			
			if(y == 0){
				x--;
				if(x==1 || x==3 || x==5 || x==7 || x==8 || x==10 || x==12)
					y = 31;
				else if(x == 2)
					y = 28;
				else
					y = 30;
			}
		}
		
		day %= 7;
		switch (day) {
		case 0:
			System.out.println("SUN");
			break;

		case 1:
			System.out.println("MON");
			break;
			
		case 2:
			System.out.println("TUE");
			break;
			
		case 3:
			System.out.println("WED");
			break;
			
		case 4:
			System.out.println("THU");
			break;
			
		case 5:
			System.out.println("FRI");
			break;
			
		case 6:
			System.out.println("SAT");
			break;
			
		default:
			break;
		}
	}
}