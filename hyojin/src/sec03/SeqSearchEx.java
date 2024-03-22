package sec03;

import java.util.Scanner;

public class SeqSearchEx {

	//�����˻��� ������ �ڼ��ϰ� ���
	static int seqSearchEx(int a[], int n, int key) {
		System.out.print("   |");
		for(int i=0;i<n;i++) {
			System.out.printf("%4d",i);
		}
		System.out.println();
		System.out.print("---+");
		for(int i=0;i<4*n+2;i++) {
			 System.out.print("-");
		}
		System.out.println();
		
		for(int i=0;i<n;i++) {
			System.out.print("   |");
			System.out.printf(String.format("%%%ds*\n",(i*4)+3),"");
			System.out.printf("%3d|",i);
			for(int k=0;k<n;k++) {
				System.out.printf("%4d", a[k]);
			}
			System.out.println("\n   |");
			if(a[i] == key)
				return i; //�˻� ����
		}
		return -1; //�˻�����
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("��ڼ�: ");
		int num = sc.nextInt();
		
		int x[] = new int[num];
		for(int i=0;i<num;i++) {
			System.out.printf("x[%d]: ", i);
			x[i] = sc.nextInt();
		}
		
		System.out.print("�˻� ��: ");
		int search = sc.nextInt();
		
		int idx = seqSearchEx(x, num, search);
		
		if (idx == -1)
			System.out.println("�˻� ���� ��Ұ� �����ϴ�.");
		else {
			System.out.println("�˻��� ���� x[" + idx + "]�� �ֽ��ϴ�.");
		}
		
	}

}
