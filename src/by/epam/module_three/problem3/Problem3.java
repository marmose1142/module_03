package by.epam.module_three.problem3;

//В строке найти количество цифр.

public class Problem3 {

	public static void main(String[] args) {
		String s = "shum69 and nevermind 1991";
		char[] ar = s.toCharArray();
		int result = 0;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] >= '0' & ar[i] <= '9') {
				result++;
			}
		}

		System.out.print(result);

	}

}
