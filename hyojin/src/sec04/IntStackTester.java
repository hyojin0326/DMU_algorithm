package sec04;

import java.util.Scanner;

public class IntStackTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStack Stack = new IntStack(64);
		Scanner sc = new Scanner(System.in);
		
		int select=5;
		while(select !=0) {
			System.out.println("현재 데이터 개수 : "+ Stack.size()+ " / "+Stack.getCapacity());
			System.out.print("(1)푸시 (2)팝 (3)피크 (4)덤프 (0)종료: ");
			select = sc.nextInt();
			switch(select) {
			case 1:
				System.out.print("데이터: ");
				int x = sc.nextInt();
				try {
					Stack.push(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				System.out.println();
				break;
			case 2: 
				try {
					System.out.println("지움: "+ Stack.pop());
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				System.out.println();
				break;
			case 3:
				try {
					System.out.println("피크한 데이터는 "+ Stack.peek()+"입니다.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
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
