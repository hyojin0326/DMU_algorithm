package sec03;

import java.util.Scanner;
import java.util.Arrays;
public class BinSearch {

	//요소수가 n개인 배열 a에서 key와 같은 요소를 이진검색
	/*static int binSearch(int a[], int n, int key) {
		int pl =0; //검색 범위위의 첫 인덱스
		int pr = n-1; //검색 범위의 끝 인덱스
		
		do {
			int pc = (pl+pr)/2; //중앙 인덱스
			if(a[pc] == key)
				return pc;
			else if(a[pc] < key) //검색 범위를 뒤쪽 절반으로 좁힘
				pl = pc+1;
			else //검색범위를 앞쪽 절반으로 좁힘
				pr = pc-1;
		}while(pl<=pr); //시작 인덱스가 끝 인덱스보다 커지면 종료
		return -1; //검색 실패
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		
		int x[] = new int[num];
		System.out.println("오름차순으로 입력하세요");
		System.out.print("x[0]: ");
		x[0] = sc.nextInt();
		
		for(int i=1;i<num;i++) {
			do {
				System.out.printf("x[%d]: ", i);
				x[i] = sc.nextInt();
			}while(x[i] < x[i-1]);
			
			
		}
		
		
		System.out.print("검색할 값: ");
		int search = sc.nextInt();
		int idx = Arrays.binarySearch(x, search);
		//int idx = binSearch(x,num,search);
		
		if(idx==-1)
			System.out.println("검색 값의 요소가 없습니다.");
		else {
			System.out.println("검색할 값은 x["+ idx+"]에 있습니다.");
		}
	}

}
