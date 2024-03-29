package sec04;

import java.util.Scanner;

public class IntQueueTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntQueue que = new IntQueue(64);
		Scanner sc = new Scanner(System.in);
		
		int select=5;
		while(select !=0) {
			System.out.println("현재 데이터 개수 : "+ que.size()+ " / "+que.getCapacity());
			System.out.print("(1)인큐 (2)디큐 (3)피크 (4)덤프 (0)종료: ");
			select = sc.nextInt();
			switch(select) {
			case 1:
				System.out.print("데이터: ");
				int x = sc.nextInt();
				try {
					que.enque(x);
				} catch (IntQueue.OverflowIntQueueException e) {
					System.out.println("큐가 가득 찼습니다.");
				}
				System.out.println();
				break;
			case 2: 
				try {
					System.out.println("지움: "+ que.deque());
				} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("큐가 비어있습니다.");
				}
				System.out.println();
				break;
			case 3:
				try {
					System.out.println("피크한 데이터는 "+ que.peek()+"입니다.");
				} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("큐가 비어있습니다.");
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
