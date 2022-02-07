package by.epam.module_three.problem11;

//Из заданной строки получить новую повторив каждый символ дважды.

public class Problem11 {

	public static void main(String[] args) {
		String s = new String("nirvana");
		StringBuffer sB = new StringBuffer(s);
		char[] ch = new char[sB.length()];

		for (int i = 0; i < ch.length; i++) {
			ch[i] = sB.charAt(i);
		}

		int j = 0;
		for (int i = 0; i < ch.length; i++) {
			sB.insert(j + 1, ch[i]);
			j = j + 2;
		}

		System.out.print(sB.toString());

	}

}
