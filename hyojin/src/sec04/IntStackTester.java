package sec04;

import java.util.Scanner;

public class IntStackTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStack Stack = new IntStack(64);
		Scanner sc = new Scanner(System.in);
		
		int select=5;
		while(select !=0) {
			System.out.println("���� ������ ���� : "+ Stack.size()+ " / "+Stack.getCapacity());
			System.out.print("(1)Ǫ�� (2)�� (3)��ũ (4)���� (0)����: ");
			select = sc.nextInt();
			switch(select) {
			case 1:
				System.out.print("������: ");
				int x = sc.nextInt();
				try {
					Stack.push(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				System.out.println();
				break;
			case 2: 
				try {
					System.out.println("����: "+ Stack.pop());
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				System.out.println();
				break;
			case 3:
				try {
					System.out.println("��ũ�� �����ʹ� "+ Stack.peek()+"�Դϴ�.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				System.out.println();
				break;
			case 4:
				Stack.dump();
				System.out.println();
				break;
				
			}
		}
	}

}
