package sec05;

import java.util.Scanner;

public class EuclidGCDEx {

	//정수 x,y의 최대공약수를 구하여 반환: 유클리드 호제법
		static int gcd(int x, int y) {
			int v=1;
			if(y==0)
				return x;
			else
				return gcd(y,x%y);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			System.out.println("두 정수의 최소공배수를 구합니다.");
			
			System.out.println("정수를 입력하세요:");
			int x = sc.nextInt();
			
			System.out.println("정수를 입력하세요:");
			int y = sc.nextInt();
			
			System.out.println("최소공배수는 "+ gcd(x,y)+"입니다.");

		}
}
