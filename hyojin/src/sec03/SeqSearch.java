package sec03;

import java.util.Scanner;

public class SeqSearch {

	//���̰� n�� �迭 a���� key�� ���� ��Ҹ� �����˻�
		/*static int seqSearch(int[]a, int n, int key) {
			int i=0;
			while(true) {
				if(i==n)
					return -1; //�˻� ����
				if(a[i] == key)
					return i; //�˻� ����
				i++;
			}
			
		}*/
		static int seqSearch(int[]a, int n, int key) {
			for(int i=0;i<n;i++) {
				if(a[i] == key)
					return i;
			}
			return -1;
			
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
			
			System.out.print("�˻��� ��: ");
			int search = sc.nextInt();
			
			int idx = seqSearch(x,num,search);
			if(idx==-1)
				System.out.println("�˻� ���� ��Ұ� �����ϴ�.");
			else {
				System.out.println("�˻��� ���� x["+ idx+"]�� �ֽ��ϴ�.");
			}
			
			
		}

}
