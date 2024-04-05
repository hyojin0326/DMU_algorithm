package task;

import java.util.Scanner;

public class BinSearch {
	// 키값을 이용해 이진검색 구현
	static int Find(int arr[],int n, int key) {
		int pl = 0; // 검색 범위 맨앞 인덱스
		int pr = n-1; //검색 범위 맨뒤 인덱스
		int pc = (pl+pr)/2;
		while(pl<=pr) {
			if(arr[pc]>key) {
				pr = (pl+pr)/2-1; //범위 좁힘
			}
			else if(arr[pc]<key)
				pl = (pl+pr)/2+1; //범위 좁힘
			else
				for(arr[pc]= key; pc>pl; pc--) {
					if(arr[pc-1]<n)
						break;
				}
				return (pl+pr)/2;
		}
		return -1; //검색 실패
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//배열의 길이와 배열값(오름차순) 으로 입력받음
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		System.out.print("arr[0]: ");
		arr[0] = sc.nextInt();
		
		for(int i=1;i<num;i++) {
			do {
				System.out.printf("arr[%d]: ", i);
				arr[i] = sc.nextInt();
			}while(arr[i] < arr[i-1]);
		}
		
		System.out.print("검색할 키값: ");
		int key = sc.nextInt();
		int value = Find(arr,num,key);
		if(value !=-1) {
			System.out.println(value);
		}
		else
			System.out.println("존재하지 않는 값입니다.");
		
		
	}

}
