package task;

import java.util.Scanner;

public class DigisNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �������� �ڸ����� ���մϴ�.");
		int n;
		do {
			System.out.print("������: ");
			n = sc.nextInt();
		}while(n<=0);
		
		int no=0; //�ڸ���
		while(n>0) {
			n/=10;
			no++;
		}
		System.out.println("�� ���� "+ no+"�ڸ��Դϴ�.");
		
	}

}
