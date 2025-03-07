import java.util.Scanner;
public class TaskEight{
	public static void main(String... sad){						

	
	Scanner snack = new Scanner(System.in);
	
	int sum = 0;
		for (int count =1;count <=10; count++)  {
			System.out.println("Enter score " + count);
			int number = snack.nextInt();

	if (number >= 0 && number <=100){
	sum +=number;
	
}else{
	System.out.println("number must between (0-100)");
} 

}
	
	System.out.println("sum of number between (0 -100) = "+sum);
		

	}
}