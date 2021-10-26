import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr;
        int num = sc.nextInt(); // 줄입력

        for (int i = 0; i < num; i++) {
            
            int a = sc.nextInt(); //학생수
            arr = new int[a];

            double sum = 0; // 학생 점수 합계

            for (int j = 0; j < a; j++) {
                int b = sc.nextInt(); //점수 입력
                arr[j] = b;
                sum = sum + b;
            }

            double mean = (sum / a) ;  //70
			double count = 0; // 평균 넘는 학생 수 변수 
			
			// 평균 넘는 학생 비율 찾기 
			for(int j = 0 ; j < a ; j++) {  // a = 5
				if(arr[j] > mean) {  // arr[j] = 50 50 70 80 100 < 70
					count++;   // 2
				}
			}

            System.out.println(String.format("%.3f%%",(count/a)*100));

        }
        sc.close();
    }
}