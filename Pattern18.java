import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		int num = 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.printf("%4d", num);
				num = getPrime(num);
			}
			System.out.println();
		}

	}

	private static int getPrime(int num) {
		boolean flag = true;
		while (flag) {
			if (isPrime(++num)) {
				flag = false;
			} else {
				flag = true;
			}
		}
		return num;
	}

	private static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) 
				return false;
			
		}
		return true;
	}

}

//output
//10
//2   3   5   7  11  13  17  19  23  29
//31  37  41  43  47  53  59  61  67  71
//73  79  83  89  97 101 103 107 109 113
//127 131 137 139 149 151 157 163 167 173
//179 181 191 193 197 199 211 223 227 229
//233 239 241 251 257 263 269 271 277 281
//283 293 307 311 313 317 331 337 347 349
//353 359 367 373 379 383 389 397 401 409
//419 421 431 433 439 443 449 457 461 463
//467 479 487 491 499 503 509 521 523 541

