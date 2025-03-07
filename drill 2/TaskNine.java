import java.util.Scanner;
public class TaskNine{

	public static void main(String... sad) {

	Scanner snack = new Scanner(System.in);

	int sum = 0;
		for (int count = 1; count <=10; count++) {

			System.out.println("Enter score  " + count);
			int score = snack.nextInt();

		sum += score;

}


if ( sum >= 1 && sum <= 100) {

	System.out.println("the sum of valid:" + sum);

} else {

	System.out.println("sum must be between (1-100): pls try again");				



		
}			
   

}



}