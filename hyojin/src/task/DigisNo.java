package task;

import java.util.Scanner;

public class DigisNo {
	// 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요.
	static int digisNo(int n) {
		int count = 0;
		for (int i = n; i > 0; i /= 10) {
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수값의 자릿수를 구합니다.");
		System.out.print("정수값 : ");

		int num = sc.nextInt();

		System.out.println("그 수는 " + digisNo(num) + "자리입니다.");
	}

}
