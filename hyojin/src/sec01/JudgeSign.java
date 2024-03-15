package sec01;

import java.util.Scanner;

public class JudgeSign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요: ");
		int n = stdIn.nextInt();
		
		if(n>0) System.out.println("양수임");
		else if(n<0) System.out.println("음수임");
		else System.out.println("0임");
		
	}

}
