package sec03;

import java.util.Scanner;

public class BlueRay {
	//뭐라는겨;;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// N: 레슨 개수
		System.out.print("N: ");
		int N = sc.nextInt();
		
		//M: 블루레이 개수
		System.out.print("M: ");
		int M = sc.nextInt();
		
		//기타 레슨의 러닝타임
		int[] A = new int [N];
		
		int pl=0;
		int pr =0;
		
		for(int i=0;i<N;i++) {
			System.out.print("A["+i+"]의 러닝타임: ");
			A[i] = sc.nextInt();
			if(pl<A[i]) {
				pl = A[i]; //레슨의 러닝타임 최댓값을 시작인덱스로 저장
				pr = pr+A[i]; //모든 레슨의 총 합을 종료 인덱스 저장
			}
		}
		
		//이진 검색
		while(pl<=pr) { //시작 인덱스가 종료 인덱스보다 커지면 종료
			int pc = (pl+pr)/2; //중간 인덱스
			int sum = 0; //레슨 러닝타임의 합
			int count =0;//사용하는 블루레이 갯수
			
			for(int i=0;i<N; i++) { //중간 인덱스 값으로 모든 레슨을 저장할 수 있는지 확인
				if( sum + A[i]>pc) { //만약 레슨들의 합의 중간 인덱스 값보다 크다면 블루레이를 하나 사용하는 것이다.
					count++; //블루레이가 카운트 되면서 증가
					sum =0; //다시 0으로 초기화
				}
				sum = sum +A[i]; //sum에 현재 레슨 러닝타임 더하기
			}
			
			if(sum !=0)
				count++; //레슨들의 러닝 타임 합(sum)이 0이 아니라면 마지막 블루레이가 필요하므로 count값 올리기
			if(count>M) //만약 중앙 인덱스 값으로 모든 레슨의 저장이 불가능하다면 시작 인덱스
				pl = pc+1;
			else // 중간 인덱스 값으로 모든 레슨이 저장 가능하다면, 종료 인덱스 = 시작인덱스 -1
				pr = pc+1;
		}
		System.out.println("블루레이의 최소한의 크기: "+ pl);
	}

}
