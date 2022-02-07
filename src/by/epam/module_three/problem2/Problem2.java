package by.epam.module_three.problem2;

//Замените в строке все вхождения 'word' на 'letter'.

public class Problem2 {

	public static void main(String[] args) {

		String s = "Hello amsterdam word nirvana word stop racism";
		String s2 = s.replace("word", "letter");
		System.out.println(s);
		System.out.print(s2);

	}

}
