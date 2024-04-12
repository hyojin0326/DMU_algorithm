package sec06;

import java.util.Scanner;

//버블정렬
public class BubbleSort {

	//배열요소a[idx1]과 a[idx2]의 값 교환
	static void swap(int[]a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	//버블정렬
	//비교하는 두 요소의 인덱스는 j-1,j라 하고 변수 j값을 어떻게 변화하는지 구현
	static void bubbleSort(int[]a, int n) {
		//a[i],a[i+1].....,a[n-1]에 대해
		//끝에서부터 앞쪽으로 스캔하면서 이웃하는 두 요소를 비교하고 교화
		for(int i=0;i<n-1; i++) {
			//배열의 끝부터 스캔하기 때문에 j의 시작값은 n-1
			//이때 두 요소인 a[j-1]과 a[j]의 값을 비교하여 앞쪽이 크면 교환한다.
			//교환 과정을 바로 앞쪽에서 수행해야 하므로 j값은 1씩 감소한다.
			//각 패스에서 앞쪽 i개의 요소는 정렬이 끝난 상태라고 가정했을때
			//정렬되지 않은 부분은 a[i],...a[n-1]이라고 가정할수있다
			//따라서 한 번의 패스에서는 j값이 i+1이 될때까지 비교, 교환을 수행하면 된다.
			for(int j=n-1; j>i; j--) {
				if(a[j-1]>a[j]) {
					swap(a,j-1,j);
				}
			}
		}
		
	}
	
	//버블정렬(버전2): 교환 횟수에 따른 멈춤
	static void bubbleSort2(int[]a, int n) {
		for(int i=0;i<n-1;i++) {
			//패스에서 교환하는 횟수
			int exchg=0;
			for(int j=n-1;j>i;j--) {
				if(a[j-1]>a[j]) {
					swap(a,j-1,j);
					exchg++; //패스를 종료한 시점에서 변수 exchg값은 해당 패스의 교환 횟수
				}
				//패스를 종료한 시점에서 exchg가 0이라면 정렬이 완료되었다고 판단할 수 있으므로
				//break문에 의해 바깥쪽의 for문을 강젤로 나와서 함수 종료
				if(exchg==0) break; //교환이 이루어지지 않으면 멈춤
				
			}
		}
	}
	
	//버블정렬(버전 3): 스캔 범위를 한정
	static void bubbleSort3(int[]a, int n) {
		//k는 수행할 패스의 범위
		//a[k]보다 앞쪽은 정렬을 마침
		//k의 값을 0으로 초기화 하는 이유는 첫번째 패스에서 모든 요소를 검사해야하기 때문에
		int k=0;
		
		while(k<n-1) {
			//각 패스에서 마지맞으로 교환한 두 요소 가운데
			//오른쪽 요소 a[j]인덱스를 저장하기 위한 변수
			int last = n-1;
			for(int j=n-1;j>k;j--) {
				if(a[j-1]> a[j]) {
					swap(a,j-1,j);
					//교환할 땨마다 오른쪽 요소의 인덱스 값은 last에 저장
					last = j;
				}
				//하나의 패스를 마쳤을때 last값을 k에 대입하여 다음에 수행할 패스의 범위를 제한
				k=last;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("버블 정렬");
		System.out.print("배열 길이:");
		int nx = sc.nextInt();
		int []x = new int[nx];
		
		for(int i=0;i<nx;i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sc.nextInt();
		}
		
		bubbleSort2(x,nx); //배열x를 단순 교환 정렬(버블정렬)
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0;i<nx;i++) {
			System.out.println("x["+i+"]: "+x[i]);
		}
				
	}

}

