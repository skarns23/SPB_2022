package Step1;
import java.util.Scanner;
public class Step1_10 {

	public static void main(String[] args) {

	int A,B,C;
	Scanner sc = new Scanner(System.in);
	A = sc.nextInt();
	B = sc.nextInt();
	C = sc.nextInt();
	int result1  = (A+B)%C;
	int result2 = ((A%C)+(B%C))%C;
	int result3 = (A*B)%C;
	int result4 = ((A%C)*(B%C))%C;
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	System.out.println(result4);
	}

}
