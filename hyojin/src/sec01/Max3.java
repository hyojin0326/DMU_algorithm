package sec01;

import java.util.Scanner;

//3���� �������� �ִ� ���ϱ�
//Ű����� �Է¹ް� ���� max�� �ִ��� ���Ѵ�.
public class Max3 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ��� ������!");
		System.out.print("a�� ��: ");
		int a = stdIn.nextInt();
		System.out.print("b�� ��: ");
		int b = stdIn.nextInt();
		System.out.print("c�� ��: ");
		int c = stdIn.nextInt();
		
		int max = a;
		if(max<b) max = b;
		if(max<c) max = c;
		
		System.out.print("�ִ��� "+ max+"�Դϴ�.");
	}
}
