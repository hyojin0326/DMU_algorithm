package sec05;

import java.util.Scanner;

public class Recur {
	//���� x,y�� �ִ������� ���Ͽ� ��ȯ: ��Ŭ���� ȣ����
		static int recur(int n) {
			if(n>0)
				return x;
			else
				return gcd(y,x%y);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);

			System.out.println("������ �Է��ϼ���:");
			int x = sc.nextInt();
			
			recur(x);

		}
}
