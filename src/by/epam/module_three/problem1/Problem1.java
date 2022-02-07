package by.epam.module_three.problem1;

//Дан массив названий переменных в camelCase.Преобразовать названия в snake_case.

public class Problem1 {

	public static void main(String[] args) {
		String[] ar1 = new String[] { "ajaxAmsterdam", "chelseaLondon", "legiaWarsaw" };

		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i] + " ; ");
		}

		int position1 = positionSearch(ar1[0]);
		int position2 = positionSearch(ar1[1]);
		int position3 = positionSearch(ar1[2]);

		for (int i = 0; i < ar1.length; i++) {
			ar1[i] = ar1[i].toLowerCase();
		}

		StringBuffer sb1 = new StringBuffer(ar1[0]);
		StringBuffer sb2 = new StringBuffer(ar1[1]);
		StringBuffer sb3 = new StringBuffer(ar1[2]);

		System.out.println();

		System.out.print(sb1.insert(position1, "_") + " ");
		System.out.print(sb2.insert(position2, "_") + " ");
		System.out.print(sb3.insert(position3, "_") + " ");
	}

	public static int positionSearch(String s) {
		int result;
		int count;

		result = 0;
		count = 0;

		char[] helloArray = s.toCharArray();

		for (int j = 0; j < helloArray.length; j++) {

			if ((helloArray[j] >= 'a') & (helloArray[j] <= 'z')) {
				count++;

			} else {
				break;
			}
		}
		result = count;
		count = 0;

		return result;
	}

}
