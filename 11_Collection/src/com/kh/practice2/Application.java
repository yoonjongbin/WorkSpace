package com.kh.practice2;

import java.util.Scanner;
import java.util.TreeSet;

public class Application {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		boolean active = true;
		long count = 0;
		Application app = new Application();
		TreeSet<Integer> lotto = new TreeSet<>();
		TreeSet<Integer> input = new TreeSet<>();

		lotto.clear();

		for (int i = 0; lotto.size() < 6; i++) {

			lotto.add((int) ((Math.random() * 48) + 1));

		}

		System.out.println(lotto.size());

		while (active) {

			input.clear();

			for (int i = 0; input.size() < 6; i++) {

				input.add((int) ((Math.random() * 48) + 1));

			}

			System.out.println("내 번호 : " + input);
			System.out.println("로또번호 : " + lotto + "\n");

			if (input.equals(lotto)) {
				System.out.println("축하합니다! 당첨되셨습니다.");
				active = false;
			} else
				System.out.println("꽝입니다!!");

			count++;
			System.out.println("시도 횟수 : " + count + "\n");
			//System.out.println("소모 금액 : " + count * 1000 + "\n");

		}

	}

}
