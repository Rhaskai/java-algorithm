import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); //5

		String arr[] = new String[N];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();                    //  OOXXOOOXO
		}

		for(int i = 0; i < arr.length; i++) {

			int cnt = 0; //횟수
			int sum = 0; //누적 합계

			for(int j = 0; j < arr[i].length(); j++) { //String 길이만큼 반복          arr[0].length() OOXXOOOXO => 9글자 => j < 9;
 
				if (arr[i].charAt(j) == 'O') {   // CharAt() 메소드를 통해 하나하나 검사
					cnt++;		//cnt 누적
				} else {
					cnt = 0; // X 이면 0으로 초기화
				}

				sum += cnt;

			}

			System.out.println(sum);

		}

		sc.close();

	}	
}
