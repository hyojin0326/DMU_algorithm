package sec05;

import java.util.Scanner;

public class FactorialEx {
	
	static int factorial(int n) {
		int x = 1;
		for(int i=n; i>0; i--) {
			x *=i;
		}
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int x = sc.nextInt();
		
		System.out.println(x+"�� ���丮����" + factorial(x)+"�Դϴ�");
		
	}

}
