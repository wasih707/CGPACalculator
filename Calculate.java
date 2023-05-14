import java.util.Arrays;
import java.util.Scanner;

public class Calculate {

	public static float sum(int A[]) {
		int n = A.length;
		float sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + A[i];
		}
		return sum;

	}

	public static float credit_total(String string) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of " + string + "s:");
		int count = sc.nextInt();
		int[] Arr = new int[count];
		System.out.println("Enter the credits one by one:");
		for (int i = 0; i < count; i++) {
			Arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(Arr));
		return sum(Arr);
	}

	public static void main(String[] args) {

		float A_credit = credit_total("A");
		float B_credit = credit_total("B");
		float C_credit = credit_total("C");
		float D_credit = credit_total("D");
		float E_credit = credit_total("E");
		float S_credit = credit_total("S");
		float total_credit = (A_credit + B_credit + C_credit + D_credit + E_credit + S_credit);
		float cgpa = ((9 * A_credit) + (8 * B_credit) + (7 * C_credit) + (6 * D_credit) + (5 * E_credit)
				+ (10 * S_credit)) / total_credit;
		System.out.printf("Your CGPA is: %.2f", cgpa);

//		while(iter != 1) {
//			if (iter%2==0) {
//				System.out.println(iter + " is even. So, I take half: " + (iter/2));
//				iter /= 2;
//				count++;
//			}
//			else {
//				System.out.println(iter + " is odd. So, I make 3n+1: " + (3*iter+1));
//				count++;
//				iter = (3*iter+1);
//				
//			}
//			
//		}
//		System.out.println("There are " + count + " steps to reach 1");

	}

}
