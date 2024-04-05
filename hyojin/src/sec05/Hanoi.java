package sec05;

import java.util.Scanner;

public class Hanoi {

	// no���� ������ x�� ��տ��� y�� ������� �ű��.
	// no�� �Űܾ��� ������ ����
	// x�� ���� ����� ��ȣ
	// y�� ��ǥ ����� ��ȣ
	static void move(int no, int x, int y) {
		// �ٴ��� ������ ������ �׷�(����[1] ~ ����[no-1])��
		// ���۱�տ��� �߰�������� �ű��.
		if (no > 1)
			move(no - 1, x, 6 - x - y);

		// �ٴ��� ����no�� ���۱�տ��� ��ǥ ������� �Ű����� ���
		System.out.printf("���� [%d]�� %d�� ��տ��� %d�� ������� �ű��.\n", no, x, y);
		
		//�ٴ��� ������ ������ �׷�(����[1] ~ ����[no-1]�� �ְ���տ��� ��ǥ ������� �ű��.)
		if (no > 1)
			move(no - 1, 6 - x - y,y);


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("�ϳ����� ž");
		System.out.print("������ ����");
		int n = sc.nextInt();
		//�� 1��տ� ���� n���� ������ �� 3������� �ű�
		move(n,1,3);

	}

}
