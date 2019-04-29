package ac.scggi.app;

public class EnhancedFor {
	public static void main(String[] args) {
		int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] korScores = {99, 95, 83, 77, 64, 55, 100, 97};
		int total = sumListEnhanced(list);
		System.out.println(total);
		System.out.println(sumListOld(korScores));
		
		addOne(list);

		printList(list);
		
		int tot = sum(1, 2);
		float tot1 = sum(1.0f, 2.0f);

	}
	
	public static int sumListEnhanced(int[] list) {
		int total = 0;
		for(int val : list) {
			total = total + val;
		}
		return total;
	}
	
	public static int sumListOld(int[] list) {
		int total = 0;
		for(int i=0; i<list.length; i++) {
			total += list[i];
		}
		return total;
	}
	
	public static void addOne(int[] list) {
		for(int i=0; i<list.length; i++) {
			list[i]++; // list[i] = list[i] + 1;
		}
	}
	
	public static void printList(int[] list) {
		for(int i=0; i<list.length; i++) {
			System.out.println(i+" ,"+list[i]);
		}
	}
	// method overloading
	public static int sum(int x, int y) {
		return x+y;
	}
	
	public static float sum(float x, float y) {
		return x+y;
	}
}
