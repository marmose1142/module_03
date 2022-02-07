package by.epam.module_three.problem7;

//В строке вставить после каждого символа 'a' символ 'b'.

public class Problem7 {

	public static void main(String[] args) {
		String s = " abalya better then rolling stones. abalya the best to be found ";
		StringBuilder str = new StringBuilder();

		str = str.append(s);
		System.out.println(str);

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a') {
				str.insert(i + 1, 'b');
			}

		}
		System.out.print(str);

	}

}
