package by.epam.module_three.problem12;

/*Вводится строка.Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено
 * "abc cde def", то должно быть выведено "abcdef".*/

public class Problem12 {

	public static void main(String[] args) {
		String s = new String("             abc cde def ");
		s = s.replaceAll(" +", "");
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int j = s.indexOf(c, i + 1);
			if (j == -1) {
				sb.append(c);
			}
		}
		System.out.print(sb);
	}

}
