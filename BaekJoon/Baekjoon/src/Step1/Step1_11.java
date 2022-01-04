package Step1;
import java.util.Scanner;
public class Step1_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A  = sc.nextInt();
		int B = sc.nextInt();
		int C = B;
		int result;
		for (int i = 0 ; i < 3; ++i)
		{
			result = A * (B%10);
			System.out.println(result);
			B /=10;
		}
		System.out.println(A*C);
	}

}
