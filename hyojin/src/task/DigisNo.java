package task;

import java.util.Scanner;

public class DigisNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수값의 자릿수를 구합니다.");
		int n;
		do {
			System.out.print("정수값: ");
			n = sc.nextInt();
		}while(n<=0);
		
		int no=0; //자릿수
		while(n>0) {
			n/=10;
			no++;
		}
		System.out.println("그 수는 "+ no+"자리입니다.");
		
	}

}
