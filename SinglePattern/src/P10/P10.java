package P10;

public class P10 {
public static void main(String[] args) {
	for (int i = 4; i >= 0; i--) {
		for (int j = 0; j < 5; j++) {
			if (i==0||j==4||i==j) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
