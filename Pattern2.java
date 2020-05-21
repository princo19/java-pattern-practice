import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		scn.close();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.printf("%3d",j);
			}
			System.out.println();
		}

	}

}

//output
//10
//1  2  3  4  5  6  7  8  9 10
//1  2  3  4  5  6  7  8  9 10
//1  2  3  4  5  6  7  8  9 10
//1  2  3  4  5  6  7  8  9 10
//1  2  3  4  5  6  7  8  9 10
//1  2  3  4  5  6  7  8  9 10
//1  2  3  4  5  6  7  8  9 10
//1  2  3  4  5  6  7  8  9 10
//1  2  3  4  5  6  7  8  9 10
//1  2  3  4  5  6  7  8  9 10

