package sec01;

import java.util.Scanner;

public class JudgeSign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���: ");
		int n = stdIn.nextInt();
		
		if(n>0) System.out.println("�����");
		else if(n<0) System.out.println("������");
		else System.out.println("0��");
		
	}

}
