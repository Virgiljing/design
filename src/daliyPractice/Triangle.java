package daliyPractice;

public class Triangle {
	public static void test(int n) {
		System.out.println("���������������ͼ��");
		for (int i = 0; i < n; i++) {
			for (int k = i; k < n ; k++) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i*2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		test(6);
	}
}
