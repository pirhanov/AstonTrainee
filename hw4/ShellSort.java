package hw4;

public class ShellSort {

	public static void sort(int[] arr) {
		int n = arr.length;

		for (int h = n / 2; h > 0; h /= 2) {

			for (int i = h; i < n; i++) {

				int temp = arr[i];
				int j = i;
				while (j >= h && temp < arr[j - h]) {
					arr[j] = arr[j - h];
					j -= h;
				}
				arr[j] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 12, 34, 15, 45, 23, 78, 98, 45 };

		System.out.println("Array before sorting: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("Array after sorting:");

		ShellSort.sort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}