import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				System.out.printf("%3c", (char) (j + 64));
			}
			System.out.println();
		}


	}

}
//output
//10
//J  I  H  G  F  E  D  C  B  A
//J  I  H  G  F  E  D  C  B  A
//J  I  H  G  F  E  D  C  B  A
//J  I  H  G  F  E  D  C  B  A
//J  I  H  G  F  E  D  C  B  A
//J  I  H  G  F  E  D  C  B  A
//J  I  H  G  F  E  D  C  B  A
//J  I  H  G  F  E  D  C  B  A
//J  I  H  G  F  E  D  C  B  A
//J  I  H  G  F  E  D  C  B  A