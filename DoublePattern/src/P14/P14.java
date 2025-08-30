package P14;

public class P14 {
	public static void main(String[] args) {
		for (int i = 1; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				if (j>=i) {
					if (i==0||j==4||i==j) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 4; i >= 1; i--) {
			for (int j = 0; j < 5; j++) {
				if (j>=i) {
					if (i==0||i==j||j==4) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}
