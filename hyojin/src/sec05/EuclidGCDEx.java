package sec05;

import java.util.Scanner;

public class EuclidGCDEx {

	//���� x,y�� �ִ������� ���Ͽ� ��ȯ: ��Ŭ���� ȣ����
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
			
			System.out.println("�� ������ �ּҰ������ ���մϴ�.");
			
			System.out.println("������ �Է��ϼ���:");
			int x = sc.nextInt();
			
			System.out.println("������ �Է��ϼ���:");
			int y = sc.nextInt();
			
			System.out.println("�ּҰ������ "+ gcd(x,y)+"�Դϴ�.");

		}
}
