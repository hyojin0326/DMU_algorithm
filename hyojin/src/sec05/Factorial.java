package sec05;

import java.util.Scanner;

public class Factorial {
	static int factorial(int n) {
		//��� ȣ�� : �Ű����� n�� ���� ���� ���� 0���� Ŭ�� -> n*factorial(n-1)
		if(n>0)
			return n*factorial(n-1);
		else
			return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���");
		int x = sc.nextInt();
		
		System.out.println(x+"�� ���丮����" + factorial(x)+"�Դϴ�");
		
	}

}
