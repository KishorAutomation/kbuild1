package P1;

public class Sorting {

	public static void main(String[] args) {

		int[] a = { 98, 2, 57, 4543, 23 };

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j <a.length; j++) {
				int temp = 0;

				if (a[i] > a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
			System.out.println(a[i]);
		}

	}

}
