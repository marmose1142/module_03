package by.epam.module_three.problem6;

//Дан текст(строка).Найти наибольшее количество подряд идущих пробелов в нем.

public class Problem6 {

	public static void main(String[] args) {
		String s = " lokomotiv moscow  rotor volgograd      chelsea london ";
		int count = 0;
		int result = 0;
		char[] ar = s.toCharArray();

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == ' ') {
				count++;
			} else {
				count = 0;
			}

			if (count > result) {
				result = count;
			}
		}
		System.out.print(result);
	}

}
