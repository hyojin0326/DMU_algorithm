package sec05;

import java.util.Scanner;

public class Recur {
	//정수 x,y의 최대공약수를 구하여 반환: 유클리드 호제법
		static int recur(int n) {
			if(n>0)
				return x;
			else
				return gcd(y,x%y);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);

			System.out.println("정수를 입력하세요:");
			int x = sc.nextInt();
			
			recur(x);

		}
}
