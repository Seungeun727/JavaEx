package com.practice01_2;

//import java.util.Random;
import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char button;

		System.out.println("1 ~ 100 숫자 맞추기 종료하려면 0번");
		int random = (int) (Math.random() * 100) + 1;
		label: while (true) {
			System.out.print(">> : ");
			int num = sc.nextInt();
			if (num == 0) {
				break;
			}
			if (num != random) { // 입력값과 num 변수가 다르다면
				if (num < random) {
					System.out.println("더 높게");
					continue;
				} else if (num > random) {
					System.out.println("더 낮게 ");
					continue;
				}
			} else if (num == random) {
				System.out.println("정답" + random);
			}
			System.out.printf("게임을 종료하시겠습니까?(y/n) >>: ");
			button = sc.next().charAt(0);

			if (button == 'n' || button == 'N') {
				random = (int) (Math.random() * 100) + 1;
				continue;
			}	
			else {
				// --> 종료합니다 프린트 출력
				break label;
			}	
		}
	}
}
