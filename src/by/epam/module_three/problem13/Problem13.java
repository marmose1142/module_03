package by.epam.module_three.problem13;

import java.util.Scanner;

/*Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
 * Случай, когда длинных слов может быть несколько, не обрабатывать.
 */

public class Problem13 {

	public static void main(String[] args) {
		String s = new String();
		String result = new String();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, insert words");
		s = sc.nextLine();

		String[] strArray = s.split(" ");

		String supportS = strArray[0];
		for (int i = 1; i < strArray.length; i++) {
			if (supportS.length() == strArray[i].length()) {
				result = "not processed";
			}
			if (supportS.length() < strArray[i].length()) {
				supportS = strArray[i];
				result = strArray[i];
			}

		}

		System.out.print(result);

	}

}
