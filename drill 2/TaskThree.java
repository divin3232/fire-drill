import java.util.Scanner;
public class TaskThree{

	public static void main(String... sad) {

	Scanner snack = new Scanner(System.in);

	int sum = 0;
		for (int count = 1; count <=10; count++) {

			System.out.println("Enter score  " + count);
			int score = snack.nextInt();

		sum += count;




	}

int average = sum / 10;

			System.out.println("The average of the 10 scores:" + average);
			


}



}