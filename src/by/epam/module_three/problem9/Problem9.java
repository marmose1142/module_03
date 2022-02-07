package by.epam.module_three.problem9;

//C помощью функции копирования и операции конкатенации составить из частей слова "информатика" слово "торт"

public class Problem9 {

	public static void main(String[] args) {
		String s = new String("информатика");

		char[] ch1 = new char[1];
		char[] ch2 = new char[2];

		s.getChars(7, 8, ch1, 0);
		s.getChars(3, 5, ch2, 0);

		String sT = new String(ch1);
		String sOP = new String(ch2);

		System.out.print(sT + sOP + sT);

	}

}
