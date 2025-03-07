import java.util.Scanner;
public class TaskFour{

	public static void main(String... sad) {

	Scanner snack = new Scanner(System.in);
	
	int sum = 0;
		for (int count = 1 ; count <=10; count++) {

			System.out.println("Enter score  " + count);
			int score = snack.nextInt();

if (count % 2 == 0) {

		sum += count;

}	

}


	System.out.println("the sum of the even indexes is:" + sum);




}



}