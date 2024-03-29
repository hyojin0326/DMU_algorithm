package sec04;

public class DoubleHeadIntStack {

	private int[] stk; // 스택의 본체
	private int capacity; // 스택용량(A,B의 합계)
	private int ptrA; // 스택포인터 A
	private int ptrB; // 스택 포인터 B

	public enum AorB {
		StackA, StackB
	} // enum열거타입

	// 실행시 예외: 스택이 비어있음
	public class EmptyDoubleHeadIntStackException extends RuntimeException {
		public EmptyDoubleHeadIntStackException() {
		}
	}

	// 실행시 예외: 스택이 가득 참
	public class OverflowDoubleHeadIntStackException extends RuntimeException {
		public OverflowDoubleHeadIntStackException() {
		}
	}

	//생성자
	public DoubleHeadIntStack(int maxlen) {
		ptrA=0;
		ptrB=maxlen-1;
		capacity=maxlen;
		try {
			stk= new int[capacity]; //스택 본체용 배열 생성
		} catch (OutOfMemoryError e) { //스택생성X
			capacity =0; 
		}
	}
	
	//스택에 x푸시
	public int push(AorB sw, int x) throws OverflowDoubleHeadIntStackException{
		if(ptrA >= ptrB+1) //스택이 가득참
			throw new OverflowDoubleHeadIntStackException();
		switch(sw) {
			case StackA:
				stk[ptrA++]=x;
				break;
			case StackB:
				stk[ptrB--] = x;
				break;
		}
		return x;	
	}
	
	//스택에서 데이터를 팝(꼭대기의 데이터를 꺼냄)
	public int pop(AorB sw) throws EmptyDoubleHeadIntStackException{
		int x =0;
		switch(sw) {
			case StackA:
				if(ptrA <=0) // 스택 A가 비어있을경우
					throw new EmptyDoubleHeadIntStackException();
				x = stk[--ptrA];
				break;
			case StackB:
				if(ptrB >= capacity-1) // 스택 B가 비어있을 경우
					throw new EmptyDoubleHeadIntStackException();
				x = stk[++ptrB];
				break;
		}
		return x;
	}
	
	//스택에서 데이터를 피크(꼭대기의 데이터를 들여다 봄)
	public int peek(AorB sw) throws EmptyDoubleHeadIntStackException{
		int x=0;
		switch(sw) {
		case StackA:
			if(ptrA <=0) // 스택 A가 비어있을경우
				throw new EmptyDoubleHeadIntStackException();
			x = stk[ptrA-1];
			break;
		case StackB:
			if(ptrB >= capacity-1) // 스택 B가 비어있을 경우
				throw new EmptyDoubleHeadIntStackException();
			x = stk[ptrB+1];
			break;
		}
		return x;
	}
	
	//스택에서 x를 검색하여 인덱스를 반환, 반환하지 못하면 -1
	public int indexOf(AorB sw, int x) {
		switch(sw){
		case StackA:
			for(int i=ptrA-1;i>=0;i--) {
				if(stk[i]==x)
					return i; //검색 성공
			}
			break;
		case StackB:
			for(int i= ptrB+1; i<capacity; i++) {
				if(stk[i] ==x)
					return i; //검색 성공
			}
			break;
		}
		return -1; //검색실패
	}
	
	//스택을 비운다
	public void clear(AorB sw) {
		switch(sw) {
		case StackA : 
			ptrA=0;
			break;
		case StackB:
			ptrB = capacity-1; 
			break;
		}
	}
	
	//스택의 용량을 반환한다. (A,B합계)
	public int getCapacity() {
		return capacity;
	}
	
	//스택에 쌓여있는 데이터 수 반환
	public int size(AorB sw) {
		switch(sw) {
		case StackA:
			return ptrA;
		case StackB:
			return capacity-ptrB-1;
		}
		return 0;
	}
	
	//스택안의 모든 데이터를 바닥->꼭대기 순으로 출력
	public void dump(AorB sw) {
		switch(sw) {
		case StackA:
			if(ptrA <=0) // 스택 A가 비어있을경우
				throw new EmptyDoubleHeadIntStackException();
			else {
				for(int i=0;i<ptrA;i++)
					System.out.print(stk[i]+ " ");
				System.out.println();
			}
			break;
		case StackB:
			if(ptrB >= capacity-1) // 스택 B가 비어있을 경우
				throw new EmptyDoubleHeadIntStackException();
			else {
				for(int i= capacity-1; i>ptrB; i--)
					System.out.print(stk[i]+" ");
				System.out.println();
			}
			break;
		}
	}

}
