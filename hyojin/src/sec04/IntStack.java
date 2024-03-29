package sec04;

public class IntStack {
	private int[] stk; //���ÿ� �迭, �ε��� 0�� ��Ұ� ������ �ٴ�, ���� ���� Ǫ�õ� �����͸� �����ϴ�
	private int capacity; //������ �뷮
	private int ptr; //���� ������ : ���ÿ� �׿��ִ� ������ ���� ��Ÿ���� �ʵ�
	
	//����� ����: ������ �������
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	
	//����� ����: ������ ���� ��
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}

	//������
	public IntStack(int maxlen) {
		ptr =0;
		capacity = maxlen; //������ �뷮(���ÿ� ���� �� �ִ� ������ ��)
		try {
			stk = new int[capacity]; //���� ��ü�� �迭�� ����
		} catch (OutOfMemoryError e) { //������ �� ����
			capacity =0;
		}
	}
	
	//���ÿ� x�� Ǫ��: ������ ���� ���� Ǫ�� �Ұ� ->����ó��(OverflowIntStackException)
	public int push(int x) throws OverflowIntStackException{
		if(ptr >= capacity) //������ ���� ��
			throw new OverflowIntStackException();
		return stk[ptr++] = x; // ���޹��� ������ x�� �迭 ��� stk[ptr]�� �����ϰ� ���� �����͸� 1����, �޼����� ��ȯ���� Ǫ���� ���̴�. 
		
	}
	
	//���ÿ� �����͸� ��(����⿡ �ִ� �����͸� ����) : ������ ����־� ���������� ->����ó��(EmptyIntStackException)
	public int pop() throws EmptyIntStackException{
		if(ptr <= 0) //������ ����ִ�.
			throw new EmptyIntStackException();
		return stk[--ptr]; //���������� ptr���� 1 ���ҽ�Ű��, �׶� stk[ptr]�� ����Ǿ��ִ� ���� ��ȯ
		//�� ��������������
	}
	
	//���ÿ��� �����͸� ��ũ(����⿡ �ִ� �����͸� �鿩�ٺ�) : ������ ������� ->����ó��(EmptyIntStackException)
	public int peek() throws EmptyIntStackException{
		if(ptr <=0)
			throw new EmptyIntStackException();
		return stk[ptr-1]; //������ ������� ������ ������ִ� ��� stk[ptr-1]��ȯ, �̶� ������ ���� ���� x->ptr�� ��ȭ x 
	}
	
	//���ÿ� ��� ��� ����
	public void clear() {
		ptr =0;
		//���ÿ��� Ǫ��,���ϴ� ��� �۾��� ptr�̿�
		//���� �迭���̸� ������ �ʿ���� ptr�� �ʱ�ȭ�����ν� ��� ��� ������
		
	}
	
	//���ÿ��� x�� ã�Ƽ� �ε����� ��ȯ, ������ -1��ȯ
	public int indexOf(int x) {
		for(int i= ptr-1; i>=0;i--) { //�������� �ٴ������� ���� �˻�
			if(stk[i] ==x)
				return i;
		}
		return -1; //�˻� ����
	}
	
	//���� �뷮(ũ��)�� ��ȯ
	public int getCapacity() {
		return capacity;
	}
	
	//������ ������ ������ Ȯ���ϴ� �޼���
	public int size() {
		return ptr;
	}
	
	//������ ����ִ°�? : ������ ��������� true, ������ ������������� false
	public boolean isEmpty() {
		return ptr<=0;
	}
	
	//������ ���� á�°�? : ������ ����á���� true, �ƴϸ� false
	public boolean isFull() {
		return ptr>=capacity;
	}
	
	//���þ��� ��� �����͸� �ٴڿ������� ����� ������ ���
	public void dump() {
		if(ptr <=0)
			System.out.println("������ ����ֽ��ϴ�.");
		else {
			for(int i=0; i<ptr; i++) {
				System.out.print(stk[i] + " ");
			}
			System.out.println();
		}
	}
	

}
