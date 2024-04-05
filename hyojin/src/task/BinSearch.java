package task;

import java.util.Scanner;

public class BinSearch {
	// Ű���� �̿��� �����˻� ����
	static int Find(int arr[],int n, int key) {
		int pl = 0; // �˻� ���� �Ǿ� �ε���
		int pr = n-1; //�˻� ���� �ǵ� �ε���
		int pc = (pl+pr)/2;
		while(pl<=pr) {
			if(arr[pc]>key) {
				pr = (pl+pr)/2-1; //���� ����
			}
			else if(arr[pc]<key)
				pl = (pl+pr)/2+1; //���� ����
			else
				for(arr[pc]= key; pc>pl; pc--) {
					if(arr[pc-1]<n)
						break;
				}
				return (pl+pr)/2;
		}
		return -1; //�˻� ����
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//�迭�� ���̿� �迭��(��������) ���� �Է¹���
		System.out.print("��ڼ� : ");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		System.out.print("arr[0]: ");
		arr[0] = sc.nextInt();
		
		for(int i=1;i<num;i++) {
			do {
				System.out.printf("arr[%d]: ", i);
				arr[i] = sc.nextInt();
			}while(arr[i] < arr[i-1]);
		}
		
		System.out.print("�˻��� Ű��: ");
		int key = sc.nextInt();
		int value = Find(arr,num,key);
		if(value !=-1) {
			System.out.println(value);
		}
		else
			System.out.println("�������� �ʴ� ���Դϴ�.");
		
		
	}

}
