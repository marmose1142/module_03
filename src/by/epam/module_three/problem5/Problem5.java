package by.epam.module_three.problem5;

/*Удалить в строке все лишние пробелы, т.е. серии идущих подряд пробелов, заменить на одиночные пробелы.
 * Крайние пробелы в строке удалить. */

public class Problem5 {

	public static void main(String[] args) {
		String s = " dynamo moscow    torpedo moscow           zenit saint petersburg   ";
		s = s.trim().replaceAll(" +", " ");
		System.out.print(s);

	}

}
