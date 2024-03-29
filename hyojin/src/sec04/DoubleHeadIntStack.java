package sec04;

public class DoubleHeadIntStack {

	private int[] stk; // ������ ��ü
	private int capacity; // ���ÿ뷮(A,B�� �հ�)
	private int ptrA; // ���������� A
	private int ptrB; // ���� ������ B

	public enum AorB {
		StackA, StackB
	} // enum����Ÿ��

	// ����� ����: ������ �������
	public class EmptyDoubleHeadIntStackException extends RuntimeException {
		public EmptyDoubleHeadIntStackException() {
		}
	}

	// ����� ����: ������ ���� ��
	public class OverflowDoubleHeadIntStackException extends RuntimeException {
		public OverflowDoubleHeadIntStackException() {
		}
	}

	//������
	public DoubleHeadIntStack(int maxlen) {
		ptrA=0;
		ptrB=maxlen-1;
		capacity=maxlen;
		try {
			stk= new int[capacity]; //���� ��ü�� �迭 ����
		} catch (OutOfMemoryError e) { //���û���X
			capacity =0; 
		}
	}
	
	//���ÿ� xǪ��
	public int push(AorB sw, int x) throws OverflowDoubleHeadIntStackException{
		if(ptrA >= ptrB+1) //������ ������
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
	
	//���ÿ��� �����͸� ��(������� �����͸� ����)
	public int pop(AorB sw) throws EmptyDoubleHeadIntStackException{
		int x =0;
		switch(sw) {
			case StackA:
				if(ptrA <=0) // ���� A�� ����������
					throw new EmptyDoubleHeadIntStackException();
				x = stk[--ptrA];
				break;
			case StackB:
				if(ptrB >= capacity-1) // ���� B�� ������� ���
					throw new EmptyDoubleHeadIntStackException();
				x = stk[++ptrB];
				break;
		}
		return x;
	}
	
	//���ÿ��� �����͸� ��ũ(������� �����͸� �鿩�� ��)
	public int peek(AorB sw) throws EmptyDoubleHeadIntStackException{
		int x=0;
		switch(sw) {
		case StackA:
			if(ptrA <=0) // ���� A�� ����������
				throw new EmptyDoubleHeadIntStackException();
			x = stk[ptrA-1];
			break;
		case StackB:
			if(ptrB >= capacity-1) // ���� B�� ������� ���
				throw new EmptyDoubleHeadIntStackException();
			x = stk[ptrB+1];
			break;
		}
		return x;
	}
	
	//���ÿ��� x�� �˻��Ͽ� �ε����� ��ȯ, ��ȯ���� ���ϸ� -1
	public int indexOf(AorB sw, int x) {
		switch(sw){
		case StackA:
			for(int i=ptrA-1;i>=0;i--) {
				if(stk[i]==x)
					return i; //�˻� ����
			}
			break;
		case StackB:
			for(int i= ptrB+1; i<capacity; i++) {
				if(stk[i] ==x)
					return i; //�˻� ����
			}
			break;
		}
		return -1; //�˻�����
	}
	
	//������ ����
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
	
	//������ �뷮�� ��ȯ�Ѵ�. (A,B�հ�)
	public int getCapacity() {
		return capacity;
	}
	
	//���ÿ� �׿��ִ� ������ �� ��ȯ
	public int size(AorB sw) {
		switch(sw) {
		case StackA:
			return ptrA;
		case StackB:
			return capacity-ptrB-1;
		}
		return 0;
	}
	
	//���þ��� ��� �����͸� �ٴ�->����� ������ ���
	public void dump(AorB sw) {
		switch(sw) {
		case StackA:
			if(ptrA <=0) // ���� A�� ����������
				throw new EmptyDoubleHeadIntStackException();
			else {
				for(int i=0;i<ptrA;i++)
					System.out.print(stk[i]+ " ");
				System.out.println();
			}
			break;
		case StackB:
			if(ptrB >= capacity-1) // ���� B�� ������� ���
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
