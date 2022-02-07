package by.epam.module_three.problem4;

//В строке найти количество чисел.

public class Problem4 {

	public static void main(String[] args) {
		String s = "dynamo moscow 1976, dynamo minsk 1982, cska moscow 1991";
		int result = 0;

		s = s.replaceAll("[^0-9]+", " ");
		result = s.trim().split(" ").length;

		System.out.print(result);

	}

}
