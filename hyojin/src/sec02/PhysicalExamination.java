package sec02;

import java.util.Scanner;

public class PhysicalExamination {
	static class PhyscData {
		String name;
		int height;

		PhyscData(String name, int height) {
			this.name = name;
			this.height = height;
		}
	}

	// ���Ű ���ϱ�
	static double aveHeight(PhyscData[] dat) {
		double sum = 0;
		for (int i = 0; i < dat.length; i++) {
			sum += dat[i].height;
		}
		return sum / dat.length;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		PhyscData[]x = {
				new PhyscData("������", 162),
				new PhyscData("������", 173),
				new PhyscData("���ؼ�", 175),
				new PhyscData("������", 171),
				new PhyscData("�̼���", 168),
				new PhyscData("����", 174),
				new PhyscData("Ȳ����", 169),
		};
		
		System.out.println("-----��ü�˻� ����Ʈ-----");
		System.out.println("�̸�    Ű");
		System.out.println("-----------------");
		for(int i=0;i<x.length; i++)
			System.out.printf("%-6s%3d\n", x[i].name, x[i].height);
		
		System.out.printf("\n��� Ű: %5.1fcm\n", aveHeight(x));
	}
}
