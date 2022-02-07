package by.epam.module_three.problem10;

//Подсчитать сколько раз среди символов заданной строки встречается буква 'a'.

public class Problem10 {

	public static void main(String[] args) {
		String s = new String("we are the champions my friends");
		int result = 0;
		char[] ar = s.toCharArray();

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == 'a') {
				result++;
			}
		}

		System.out.print(result);

	}

}
