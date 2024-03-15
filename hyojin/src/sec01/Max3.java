package sec01;

import java.util.Scanner;

//3개의 정수값둘 최댓값 구하기
//키보드로 입력받고 변수 max로 최댓값을 구한다.
public class Max3 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값을 구하자!");
		System.out.print("a의 값: ");
		int a = stdIn.nextInt();
		System.out.print("b의 값: ");
		int b = stdIn.nextInt();
		System.out.print("c의 값: ");
		int c = stdIn.nextInt();
		
		int max = a;
		if(max<b) max = b;
		if(max<c) max = c;
		
		System.out.print("최댓값은 "+ max+"입니다.");
	}
}
