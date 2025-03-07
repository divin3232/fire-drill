public class TaskNine{
	public static void main(String... sad){
	


	int SumofFour = 0;

	int multipleofFour = 4;

		for(int count = 0; count < 5; count++){
			SumofFour += multipleofFour;
			multipleofFour *= 4;
		}

	int SumofEight = 0;

	int multipleofEight = 8;

		for(int count = 0; count < 5; count++){
			SumofEight += multipleofEight;
			multipleofEight *= 8;
		}

	int answer = SumofFour + SumofEight;
		System.out.print(answer * answer);
	}


}

