package sec03;

import java.util.Scanner;
import java.util.Arrays;
public class BinSearch {

	//��Ҽ��� n���� �迭 a���� key�� ���� ��Ҹ� �����˻�
	/*static int binSearch(int a[], int n, int key) {
		int pl =0; //�˻� �������� ù �ε���
		int pr = n-1; //�˻� ������ �� �ε���
		
		do {
			int pc = (pl+pr)/2; //�߾� �ε���
			if(a[pc] == key)
				return pc;
			else if(a[pc] < key) //�˻� ������ ���� �������� ����
				pl = pc+1;
			else //�˻������� ���� �������� ����
				pr = pc-1;
		}while(pl<=pr); //���� �ε����� �� �ε������� Ŀ���� ����
		return -1; //�˻� ����
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("��ڼ�: ");
		int num = sc.nextInt();
		
		int x[] = new int[num];
		System.out.println("������������ �Է��ϼ���");
		System.out.print("x[0]: ");
		x[0] = sc.nextInt();
		
		for(int i=1;i<num;i++) {
			do {
				System.out.printf("x[%d]: ", i);
				x[i] = sc.nextInt();
			}while(x[i] < x[i-1]);
			
			
		}
		
		
		System.out.print("�˻��� ��: ");
		int search = sc.nextInt();
		int idx = Arrays.binarySearch(x, search);
		//int idx = binSearch(x,num,search);
		
		if(idx==-1)
			System.out.println("�˻� ���� ��Ұ� �����ϴ�.");
		else {
			System.out.println("�˻��� ���� x["+ idx+"]�� �ֽ��ϴ�.");
		}
	}

}
