import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		for(int i = 1 ; i<=n;i++) {
			for (int j=1 ; j <=n;j++) {
				System.out.printf("%3d" ,i);
		}
		System.out.println();
		}

	}

}


// output
//10
//1  1  1  1  1  1  1  1  1  1
//2  2  2  2  2  2  2  2  2  2
//3  3  3  3  3  3  3  3  3  3
//4  4  4  4  4  4  4  4  4  4
//5  5  5  5  5  5  5  5  5  5
//6  6  6  6  6  6  6  6  6  6
//7  7  7  7  7  7  7  7  7  7
//8  8  8  8  8  8  8  8  8  8
//9  9  9  9  9  9  9  9  9  9
//10 10 10 10 10 10 10 10 10 10