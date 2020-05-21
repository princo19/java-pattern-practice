import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		for (int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--) {
				System.out.printf("%4d",j);
			}
			System.out.println();
		}

	}

}
//output
//10
//10   9   8   7   6   5   4   3   2   1
//10   9   8   7   6   5   4   3   2   1
//10   9   8   7   6   5   4   3   2   1
//10   9   8   7   6   5   4   3   2   1
//10   9   8   7   6   5   4   3   2   1
//10   9   8   7   6   5   4   3   2   1
//10   9   8   7   6   5   4   3   2   1
//10   9   8   7   6   5   4   3   2   1
//10   9   8   7   6   5   4   3   2   1
//10   9   8   7   6   5   4   3   2   1

