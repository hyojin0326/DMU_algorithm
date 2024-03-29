package sec04;

public class IntStack {
	private int[] stk; //스택용 배열, 인덱스 0인 요소가 스택의 바닥, 가장 먼저 푸시된 데이터를 저장하는
	private int capacity; //스택의 용량
	private int ptr; //스택 포인터 : 스택에 쌓여있는 데이터 수를 나타내는 필드
	
	//실행시 예외: 스택이 비어있음
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	
	//실행시 예외: 스택이 가득 참
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}

	//생성자
	public IntStack(int maxlen) {
		ptr =0;
		capacity = maxlen; //스택의 용량(스택에 쌓을 수 있는 데이터 수)
		try {
			stk = new int[capacity]; //스택 본체용 배열을 생성
		} catch (OutOfMemoryError e) { //생성할 수 없음
			capacity =0;
		}
	}
	
	//스택에 x를 푸시: 스택이 가득 차서 푸시 불가 ->예외처리(OverflowIntStackException)
	public int push(int x) throws OverflowIntStackException{
		if(ptr >= capacity) //스택이 가득 참
			throw new OverflowIntStackException();
		return stk[ptr++] = x; // 전달받은 데이터 x를 배열 요소 stk[ptr]에 저장하고 스택 포인터를 1증가, 메서드의 반환값은 푸시한 값이다. 
		
	}
	
	//스택에 데이터를 팝(꼭대기에 있는 데이터를 꺼냄) : 스택이 비어있어 꺼낼수없음 ->예외처리(EmptyIntStackException)
	public int pop() throws EmptyIntStackException{
		if(ptr <= 0) //스택이 비어있다.
			throw new EmptyIntStackException();
		return stk[--ptr]; //스택포인터 ptr값을 1 감소시키고, 그때 stk[ptr]에 저장되어있는 값을 반환
		//왜 전위연산자이지
	}
	
	//스택에서 데이터를 피크(꼭대기에 있는 데이터를 들여다봄) : 스택이 비어있음 ->예외처리(EmptyIntStackException)
	public int peek() throws EmptyIntStackException{
		if(ptr <=0)
			throw new EmptyIntStackException();
		return stk[ptr-1]; //스택이 비어있지 않으면 꼭대기있는 요소 stk[ptr-1]반환, 이때 데이터 삽입 삭제 x->ptr값 변화 x 
	}
	
	//스택에 모든 요소 삭제
	public void clear() {
		ptr =0;
		//스택에서 푸시,팝하는 모든 작업은 ptr이용
		//스택 배열길이를 변경할 필요없이 ptr을 초기화함으로써 모든 요소 삭제됨
		
	}
	
	//스택에서 x를 찾아서 인덱스를 반환, 없으면 -1반환
	public int indexOf(int x) {
		for(int i= ptr-1; i>=0;i--) { //꼭대기부터 바닥쪽으로 선형 검색
			if(stk[i] ==x)
				return i;
		}
		return -1; //검색 실패
	}
	
	//스택 용량(크기)를 반환
	public int getCapacity() {
		return capacity;
	}
	
	//스택의 데이터 개수를 확인하는 메서드
	public int size() {
		return ptr;
	}
	
	//스택이 비어있는가? : 스택이 비어있으면 true, 스택이 비어있지않으면 false
	public boolean isEmpty() {
		return ptr<=0;
	}
	
	//스택이 가득 찼는가? : 스택이 가득찼으면 true, 아니면 false
	public boolean isFull() {
		return ptr>=capacity;
	}
	
	//스택안의 모든 데이터를 바닥에서부터 꼭대기 순서로 출력
	public void dump() {
		if(ptr <=0)
			System.out.println("스택이 비어있습니다.");
		else {
			for(int i=0; i<ptr; i++) {
				System.out.print(stk[i] + " ");
			}
			System.out.println();
		}
	}
	

}
