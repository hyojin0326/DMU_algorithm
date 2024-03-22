package sec03;

import java.util.Scanner;

public class BlueRay {
	//����°�;;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// N: ���� ����
		System.out.print("N: ");
		int N = sc.nextInt();
		
		//M: ��緹�� ����
		System.out.print("M: ");
		int M = sc.nextInt();
		
		//��Ÿ ������ ����Ÿ��
		int[] A = new int [N];
		
		int pl=0;
		int pr =0;
		
		for(int i=0;i<N;i++) {
			System.out.print("A["+i+"]�� ����Ÿ��: ");
			A[i] = sc.nextInt();
			if(pl<A[i]) {
				pl = A[i]; //������ ����Ÿ�� �ִ��� �����ε����� ����
				pr = pr+A[i]; //��� ������ �� ���� ���� �ε��� ����
			}
		}
		
		//���� �˻�
		while(pl<=pr) { //���� �ε����� ���� �ε������� Ŀ���� ����
			int pc = (pl+pr)/2; //�߰� �ε���
			int sum = 0; //���� ����Ÿ���� ��
			int count =0;//����ϴ� ��緹�� ����
			
			for(int i=0;i<N; i++) { //�߰� �ε��� ������ ��� ������ ������ �� �ִ��� Ȯ��
				if( sum + A[i]>pc) { //���� �������� ���� �߰� �ε��� ������ ũ�ٸ� ��緹�̸� �ϳ� ����ϴ� ���̴�.
					count++; //��緹�̰� ī��Ʈ �Ǹ鼭 ����
					sum =0; //�ٽ� 0���� �ʱ�ȭ
				}
				sum = sum +A[i]; //sum�� ���� ���� ����Ÿ�� ���ϱ�
			}
			
			if(sum !=0)
				count++; //�������� ���� Ÿ�� ��(sum)�� 0�� �ƴ϶�� ������ ��緹�̰� �ʿ��ϹǷ� count�� �ø���
			if(count>M) //���� �߾� �ε��� ������ ��� ������ ������ �Ұ����ϴٸ� ���� �ε���
				pl = pc+1;
			else // �߰� �ε��� ������ ��� ������ ���� �����ϴٸ�, ���� �ε��� = �����ε��� -1
				pr = pc+1;
		}
		System.out.println("��緹���� �ּ����� ũ��: "+ pl);
	}

}
