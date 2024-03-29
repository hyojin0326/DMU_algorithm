package sec04;

public class IntQueue {
	private int[] que;
	private int capacity;
	private int front;
	private int rear;
	private int num;

	// ����� ����: ť�� �������
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {
		}
	}

	// ����� ����: ť�� ���� ��
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {
		}
	}

	// ������: ť ��ü�� �迭�������ϴ� ���� �غ� �۾� ����
	public IntQueue(int maxlen) {
		num = front = rear = 0; // 0���� �ʱ�ȭ
		capacity = maxlen;
		try {
			que = new int[capacity]; // ���̰� capacity�� ť ��ü�� �迭 ����
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}

	// �� ������ ��ť
	public int enque(int x) throws OverflowIntQueueException {
		if (num >= capacity) // ť�� ������
			throw new OverflowIntQueueException();
		que[rear++] = x;
		num++; // ������ ��ť�ϰ� rear�� num ���� ������Ű�� ��ť �۾� ��

		// ��ť�ϱ� �� rear���� �迭 ũ�⺸�� 1���� ��� ->��ť �޼��带 ������ ��
		// rear���� �迭ũ��� �������鼭 �迭�� ������ �ε����� �ʰ�
		// �̷��� ������ rear���� capacity�� �������� ���� �����ϱ� ���� rear�� ���� 1 ������������
		// rear�� �迭�� ù��° ����� 0���� ����
		if (rear == capacity)
			rear = 0;
		return x;
	}

	// ť���� ������ ��ť
	public int deque() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();
		int x = que[front++];
		num--; // ������ ��ť�� front���� 1����, num1����

		// ���� front�� ���� ť�� �뷮�� capacity�� �������� front���� �迭�� �� �� �ε����� 0���� �����Ѵ�.
		if (front == capacity)
			front = 0;
		return x;
	}

	// ť���� ������ ��ũ
	public int peek() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();
		return que[front];
	}

	// ť�� ����
	public void clear() {
		num = front = rear = 0; // �ʱ�ȭ
	}

	// ť���� x�� �˻��ϸ� �ε��� ��ȯ, ���н� -1
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % capacity; // ��ĵ�� �迭�� �������� ù ��Ұ� �ƴ϶� ť�� ������ ù ��ұ� ������ ������ ���� �ʿ�
			if (que[idx] == x)
				return idx;
		}
		return -1;
	}

	// ť�� �׿��ִ� �����ͼ� ��ȯ
	public int size() {
		return num;
	}

	// ���� �뷮(ũ��)�� ��ȯ
	public int getCapacity() {
		return capacity;
	}

	// ť ���� ��� �����͸� front���� rear������ ���
	public void dump() {
		if (num <= 0)
			System.out.println("ť�� ����ִ�.");
		else {
			for (int i = 0; i < num; i++) {
				System.out.print(que[(i + front) % capacity] + " ");
			}
			System.out.println();
		}
	}
}
