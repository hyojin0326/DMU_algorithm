package sec05;

import java.util.Scanner;

public class Recur {

		static void recur(int n) {
			//순수재귀 메서드
			if(n>0) {
				recur(n-1);
				System.out.println(n);
				recur(n-2);
			}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);

			System.out.println("정수를 입력하세요:");
			int x = sc.nextInt();
			
			recur(x);

		}
}
