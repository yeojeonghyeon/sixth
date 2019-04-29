package ac.scggi.app.shape;

public class TimesTable {
	public static void main(String[] args) {
		for(int i=2; i<10; i++) {// 2,3,4,5,6,7,8,9
			for(int j=1; j<10; j++) { // 1,2,3,4,5,6,7,8,9
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}
}
