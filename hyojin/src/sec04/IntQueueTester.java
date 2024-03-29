package sec04;

import java.util.Scanner;

public class IntQueueTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntQueue que = new IntQueue(64);
		Scanner sc = new Scanner(System.in);
		
		int select=5;
		while(select !=0) {
			System.out.println("���� ������ ���� : "+ que.size()+ " / "+que.getCapacity());
			System.out.print("(1)��ť (2)��ť (3)��ũ (4)���� (0)����: ");
			select = sc.nextInt();
			switch(select) {
			case 1:
				System.out.print("������: ");
				int x = sc.nextInt();
				try {
					que.enque(x);
				} catch (IntQueue.OverflowIntQueueException e) {
					System.out.println("ť�� ���� á���ϴ�.");
				}
				System.out.println();
				break;
			case 2: 
				try {
					System.out.println("����: "+ que.deque());
				} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("ť�� ����ֽ��ϴ�.");
				}
				System.out.println();
				break;
			case 3:
				try {
					System.out.println("��ũ�� �����ʹ� "+ que.peek()+"�Դϴ�.");
				} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("ť�� ����ֽ��ϴ�.");
				}
				System.out.println();
				break;
			case 4:
				que.dump();	
				System.out.println();
				break;
				
			}
		}
	}

}
