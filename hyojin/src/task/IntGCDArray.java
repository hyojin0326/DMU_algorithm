package task;

import java.util.Scanner;

/*
 * 유클리드 호재법을 이용(?) -> 첫번쨰 인자는 y값, 두번쨰 인자는 x%y
 * ex) x=30, y=36
 * 최대공약수 : gcd(30,36) -> gcd(36,30) -> gcd(30,6) -> gcd(6,0)--->6
 * 최소공배수: 두수*최대공약수
 * ex) 30*36/6 = 180
 */
public class IntGCDArray {

	static int gcd (int x,int y) {
		if(y==0)
			return x;
		else
			return gcd(y,x%y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//배열길이 입력받기
		System.out.print("배열의 길이를 입력하세요: ");
		int num = sc.nextInt();
		//배열길이가 num인 x배열 생성
		int []x = new int[num];
		for(int i=0;i<num;i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();			
		}
		
		int value=0;
		//최대공약수 구하기
		value = gcd(x[0],x[1]);
		for(int i=2;i<x.length;i++) {
			value=gcd(value,x[i]);
		}
		System.out.println("최대공약수는 "+value+"입니다.");
			
	}

}
