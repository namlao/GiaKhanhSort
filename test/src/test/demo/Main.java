package test.demo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		SortKhanh sort = new BubleSort();
		
 		for (int i : sort.sort(arr)) {
			System.out.print(i+" ");
		}
	}
}
