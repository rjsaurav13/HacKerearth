package javahe;

public class SelectionSort {
	public static void main(String[] args) {
		{
			int arr[] = { 64, 25, 12, 22, 11 };
			int n = arr.length;
			for (int i = 0; i < n - 1; i++) {
				int min = i;
				for (int j = i + 1; j < n; j++)
					if (arr[j] < arr[min])
						min = j;
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
			System.out.println("Sorted array");
			for (int i = 0; i < n; ++i)
				System.out.print(arr[i] + " ");
			System.out.println();

		}
	}
}
