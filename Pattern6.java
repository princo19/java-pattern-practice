import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		for(int i=1;i<=n;i++) {
			for(int j=1; j<=n;j++) {
				System.out.printf("%3c",(char)(i+64));
			}
			System.out.println();
		}

	}

}


//output
//10
//10 10 10 10 10 10 10 10 10 10
// 9  9  9  9  9  9  9  9  9  9
// 8  8  8  8  8  8  8  8  8  8
// 7  7  7  7  7  7  7  7  7  7
// 6  6  6  6  6  6  6  6  6  6
// 5  5  5  5  5  5  5  5  5  5
// 4  4  4  4  4  4  4  4  4  4
// 3  3  3  3  3  3  3  3  3  3
// 2  2  2  2  2  2  2  2  2  2
// 1  1  1  1  1  1  1  1  1  1
