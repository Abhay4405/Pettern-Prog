package P14;

import java.util.Iterator;

public class P14 {
public static void main(String[] args) {
	for (int i = 0; i < 5; i++) {
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
}
}
