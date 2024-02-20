import java.util.Arrays;

public class Lab5 {

	public static void main(String[] args) {
		String[] list1 = { "T", "To", "Tonyf", "Ton", "Tony" };
		Integer[] list2 = { 1, 6, 3, 4, 5 };
		Double[] list3 = { 9.5, 6.7, 3.4, 1.9, 8.9 };
	
		System.out.println("The max of " + Arrays.asList(list1) + " is: " + max(list1));
		System.out.println("The max of " + Arrays.asList(list2) + " is: " + max(list2));
		System.out.println("The max of " + Arrays.asList(list3) + " is: " + max(list3));

	}
	
	public static <E extends Comparable<E>> E max(E[] list) {
		
		int maxIndex = 0;
		
		for (int i = 1; i < list.length; i++) {
			
			if (list[maxIndex].compareTo(list[i]) < 0) {
				
				// Debugger to ensure program is performing correctly
				// System.out.println("DEBUG: New Max -----> " + list[i]);
				maxIndex = i;
			}
			
		}
		
		return list[maxIndex];
	}

}
