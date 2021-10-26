import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); //734
		int M = sc.nextInt();
		int a, b, c; // a = 1의 자리 b = 10의 자리 c = 100의 자리
		int sum, sum2;
		sc.close();
		
		while(true) {
			a = (N % 10) * 100; // 400
			b = (N % 100) - (a / 100); //34 - 4  = 30
			c = (N - (N % 100)) / 100; // 734 - 34 = 700 / 100 = 7

			sum = a+b+c;

			a = (M % 10) * 100;
			b = (M % 100) - (a / 100);
			c = (M - (M % 100)) / 100;

			sum2 = a+b+c;

			if (sum > sum2) {
				System.out.println(sum);
				break;
			} else {
				System.out.println(sum2);
				break;
			}
		}

	}	
}
