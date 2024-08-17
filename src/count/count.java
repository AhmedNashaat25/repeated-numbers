package count;

import java.util.Scanner;

public class count {

	public static void main(String[] args) {
		
		System.out.println("Enter the length of the array");
		Scanner input = new Scanner(System.in);
		int arrayLength = input.nextInt();
		int [] array = new int [arrayLength];
		int temp = 0;
		
		
		for(int i = 0; i < arrayLength; i++) {					//read array elements
				int arrayElement = input.nextInt();
				array[i] = arrayElement;
		}
		
		for(int i = 0; i < arrayLength; i++) {					//sort the array
			for(int j = i + 1; j < arrayLength; j++) {
				if(array[i] > array[j]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		for(int i = 0; i < arrayLength; i++) {					//count reapeated numbers
			int count = 1;
			for(int j = i + 1; j < arrayLength; j++) {
				if(array[i] == array[j]) {
					count++;
				}else {
					break;
				}
			}
			if(count > 1) {
				System.out.println(array[i]+" repeated "+count+" times");
				i += count - 1;
			}
		}
	}
}
