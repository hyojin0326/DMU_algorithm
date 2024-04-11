package task;

import java.util.Scanner;

//원하는 값찾기 성공
//검색실패 성공
public class BinSearch {
	
	//검색할 키 값과 같은 값을 갖는 요소가 하나 이상일 경우, 그 요소중 맨 앞의 요소를 구하라
	static int binsearch(int value, int[]arr,int num) {
		int pl=0;
		int pr= arr.length;
		
		do {
			//가운데 인덱스값 구하기
			int pc = (pl+pr)/2;
			//원하는 값을 찾은경우 맨앞 요소를 검색
			if(arr[pc]==value){
				for(;;) {
					if(arr[pc-1] != value)
						break;
					pc--;
				}
				return pc; //검색 성공
			}
			else if(arr[pc]<value) {
				pl = pc+1; //검색 범위를 줄임
			}
			else if(arr[pc]>value) {
				pr=pc-1;
			}
		} while(pl<pr);
		return -1; //검색 실패
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		
		//해당 요솟수를 갖는 배열 생성
		int []arr = new int[num];
		
		//배열 값 입력 받기
		System.out.println("배열을 입력하세요");
		System.out.print("arr[0]: ");
		arr[0] = sc.nextInt();
		
		for(int i=1;i<num; i++) {
			//오름차순으로 입력하지않으면 다시 반복
			do {
				System.out.print("arr["+i+"] : ");
				arr[i] = sc.nextInt();
			} while(arr[i]<arr[i-1]);
		}
		
		System.out.print("찾으려는 값을 입력하세요: ");
		int value = sc.nextInt();
		
		//num길이의 arr배열에 value값을 가지고 있는 인덱스 찾기
		int idx = binsearch(value, arr, num);
		if(idx ==-1) {
			System.out.println("찾으려는 값이 존재하지 않습니다.");
		}
		else
			System.out.println("찾으려는 값의 위치는 arr["+idx+"] 입니다.");
	}
	
}
