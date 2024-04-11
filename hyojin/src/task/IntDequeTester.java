package task;

import java.util.Scanner;

public class IntDequeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//용량이 64인 큐 생성
		IntDeque que = new IntDeque(64);
		Scanner sc = new Scanner(System.in);
		
		
		int select=-1;
		int data,idx;
		while(select!=0) {
			System.out.printf("현재 데이터 개수 : %d / %d\n", que.size(), que.getCapacity());
			System.out.println("(1)맨앞의 인큐 (2)맨앞에서 디큐 (3)맨앞에서 피크");
			System.out.println("(4)맨끝의 인큐 (5)맨끝에서 디큐 (6)맨끝에서 피크");
			System.out.print("(7)덤프 (8)검색 (0)종료 : ");
			select = sc.nextInt();
			switch(select) {
			case 1:
				System.out.print("데이터 : ");
				data = sc.nextInt();
				que.enque(IntDeque.AorB.QueueA, data);
				break;
			case 2:
				data = que.deque(IntDeque.AorB.QueueA);
				System.out.println("데이터 "+data+" 삭제");
				break;
			case 3:
				data = que.peek(IntDeque.AorB.QueueA);
				System.out.println(data);
				break;
			case 4:
				System.out.print("데이터 : ");
				data = sc.nextInt();
				que.enque(IntDeque.AorB.QueueB, data);
				break;
			case 5:
				data = que.deque(IntDeque.AorB.QueueB);
				System.out.println("데이터 "+data+" 삭제");
				break;
			case 6:
				data = que.peek(IntDeque.AorB.QueueB);
				System.out.println(data);
				break;
			case 7:
				que.dump();
				break;
			case 8:
				System.out.print("검색할 데이터: ");
				data = sc.nextInt();
				idx = que.indexOf(data);
				System.out.println(idx+"번째 인덱스에 존재함");
				break;
				
			}
		}
	}

}
