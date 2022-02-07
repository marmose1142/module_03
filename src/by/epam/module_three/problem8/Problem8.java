package by.epam.module_three.problem8;

import java.util.Scanner;

//Проверить, является ли заданное слово палиндромом.

public class Problem8 {

	public static void main(String[] args) {
		String s;
		String sReverse;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert word");
		s = sc.nextLine();

		StringBuilder stBld = new StringBuilder();
		StringBuilder stBldReverse = new StringBuilder();

		stBld.append(s);
		stBldReverse.append(stBld.reverse());

		sReverse = stBldReverse.toString();

		if (s.equals(sReverse)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

}
