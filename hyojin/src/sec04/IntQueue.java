package sec04;

public class IntQueue {
	private int[] que;
	private int capacity;
	private int front;
	private int rear;
	private int num;

	// 실행시 예외: 큐가 비어있음
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {
		}
	}

	// 실행시 예외: 큐가 가득 참
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {
		}
	}

	// 생성자: 큐 본체용 배열을생성하는 등의 준비 작업 수행
	public IntQueue(int maxlen) {
		num = front = rear = 0; // 0으로 초기화
		capacity = maxlen;
		try {
			que = new int[capacity]; // 길이가 capacity인 큐 본체용 배열 생성
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}

	// 쿠에 데이터 인큐
	public int enque(int x) throws OverflowIntQueueException {
		if (num >= capacity) // 큐가 가득참
			throw new OverflowIntQueueException();
		que[rear++] = x;
		num++; // 데이터 인큐하고 rear와 num 값을 증가시키면 인큐 작업 끝

		// 인큐하기 전 rear값이 배열 크기보다 1작을 경우 ->인큐 메서드를 수행한 후
		// rear값이 배열크기와 같아지면서 배열의 마지막 인덱스를 초과
		// 이러한 이유로 rear값이 capacity와 같아지는 것을 방지하기 위해 rear의 값을 1 증가시켰을때
		// rear를 배열의 첫번째 요소인 0으로 변경
		if (rear == capacity)
			rear = 0;
		return x;
	}

	// 큐에서 데이터 디큐
	public int deque() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();
		int x = que[front++];
		num--; // 데이터 디큐후 front값을 1증가, num1감소

		// 만약 front의 값이 큐의 용량인 capacity와 같아지면 front값을 배열의 맨 앞 인덱스인 0으로 변경한다.
		if (front == capacity)
			front = 0;
		return x;
	}

	// 큐에서 데이터 피크
	public int peek() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();
		return que[front];
	}

	// 큐를 비운다
	public void clear() {
		num = front = rear = 0; // 초기화
	}

	// 큐에서 x를 검색하면 인덱스 반환, 실패시 -1
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % capacity; // 스캔은 배열의 물리적인 첫 요소가 아니라 큐의 논리적인 첫 요소기 때문에 복잡한 계산식 필요
			if (que[idx] == x)
				return idx;
		}
		return -1;
	}

	// 큐에 쌓여있는 데이터수 반환
	public int size() {
		return num;
	}

	// 스택 용량(크기)를 반환
	public int getCapacity() {
		return capacity;
	}

	// 큐 안의 모든 데이터를 front에서 rear순으로 출력
	public void dump() {
		if (num <= 0)
			System.out.println("큐가 비어있다.");
		else {
			for (int i = 0; i < num; i++) {
				System.out.print(que[(i + front) % capacity] + " ");
			}
			System.out.println();
		}
	}
}
