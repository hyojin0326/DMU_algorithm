package task;

public class IntDeque {

	//큐의 본채
	private int[] que;
	//스택 용량(A,B모두)
	private int capacity;
	
	private int frontA;
	private int rearA;
	private int frontB;
	private int rearB;
	
	//데이터 갯수(a와 b)
	private int numA;
	private int numB;
	
	//A가 앞에서부터, B가 뒤에서부터
	public enum AorB{
		QueueA, QueueB
	}
	
	//실행시 예외: 큐가 비어있음
	public class EmptyIntDequeException extends RuntimeException{
		public EmptyIntDequeException() {
			
		}
	}
	
	//실행시 예외:큐가 가득 참
	public class OverFlowIntDequeException extends RuntimeException{
		public OverFlowIntDequeException() {
			
		}
	}
	
	//생성자
	public IntDeque(int maxlen) {
		numA = numB = frontA = rearA =0; //0으로 초기화
		frontB=rearB = maxlen-1; //QueueB는 끝에서부터 출발임
		capacity = maxlen;
		try {
			que = new int[capacity]; //길이가 capacity인 큐 배열 생성
		}catch(OutOfMemoryError e) {
			capacity =0;
		}
	}
	
	//큐에 데이터 인큐
	public int enque(AorB sw, int x) throws OverFlowIntDequeException{
		if(numA+numB >= capacity) // 큐가 가득 참
			throw new OverFlowIntDequeException();
		switch(sw) {
		case QueueA:
			que[rearA++] = x;
			numA++;
			
			if(rearA == capacity)
				rearA =0;
			break;
		case QueueB:
			que[rearB--]=x;
			numB++;
			
			if(rearB ==0)
				rearB = que.length-1;
		}
		return x;
	}
	
	//큐에 데이터 디큐
	public int deque(AorB sw) throws EmptyIntDequeException{			
		int x=0;
		switch(sw) {
		case QueueA:
			if(numA<=0)
				throw new EmptyIntDequeException();
			x = que[frontA++];
			numA--;
			
			if(frontA == capacity)
				frontA=0;
			break;
		case QueueB:
			if(numB<=0)
				throw new EmptyIntDequeException();
			x = que[frontB--];
			numB--;
			
			if(frontB ==0)
				frontB = que.length-1;
			break;
		}
		return x;
	}
	
	//큐에서 데이터 피크
	public int peek(AorB sw) throws EmptyIntDequeException{
		int x=0;
		switch(sw) {
		case QueueA:
			if(numA<=0)
				throw new EmptyIntDequeException();
			x = que[frontA];
			break;
		case QueueB:
			if(numB<=0)
				throw new EmptyIntDequeException();
			x = que[frontB];
			break;
		}
		return x;
	}
	
	//큐를 비운다
	public void clear() {
		numA = numB = frontA = rearA =0; //0으로 초기화
		frontB=rearB = que.length-1;
	}
	
	//큐에서 x를 검색하면 인덱스반환, 실패시 -1
	//A에서 검색 후 B에서 검색
	public int indexOf(int x) {
		int idx=-1;
		//A의 데이터가 있을경우
		if(numA >0) {
			for(int i=0;i<numA;i++) {
				idx = (i+frontA)%capacity;
				if(que[idx]==x)
					return idx;
			}
		}
		//B의 데이터가 있을경우
		if(numB>0) {
			for(int i=0;i<numB;i++) {
				idx = (frontB-i)%capacity;
				if(que[idx]==x)
					return idx;
			}
		}
		return-1;
	}
	
	// 큐에 쌓여있는 데이터수 반환
	public int size() {
		return numA+numB;
	}

	// 스택 용량(크기)를 반환
	public int getCapacity() {
		return capacity;
	}
	
	//큐안의 데이터를 front->rear순으로 출력
	//A의 값 출력후 B값 출력
	public void dump() {
		if(numA+numB<=0)
			System.out.println("큐가 비어있습니다.");
		else {
			//A의 데이터가 있을경우
			if(numA >0) {
				for (int i = 0; i < numA; i++) {
					System.out.print(que[(i + frontA) % capacity] + " ");
				}
			}
			//B의 데이터가 있을경우
			if(numB>0) {
				for (int i = numB-1; i >= 0; i--) {
					System.out.print(que[(frontB-i) % capacity] + " ");
				}
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
}
