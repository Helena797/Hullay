package control;

public class Quize {

	public static void main(String[] args) {
		//first question
				System.out.println("Where is captial of Texas?");
				System.out.println("1) Dallas");
				System.out.println("2) Austin");
				System.out.println("3) Elpaso");
				
				Scanner obj = new Scanner(System.in);
				int answer1 = obj.nextInt();
				
				int score = 0;
				if(answer1 == 2) {
					System.out.println("Correct");
					score = 50;
				} else {
					System.out.println("Wrong!");
				}
				
				//second question
				System.out.println("Where was Kennedy merdered?");
				System.out.println("1) Dallas");
				System.out.println("2) Austin");
				System.out.println("3) Elpaso");
				
				int answer2 = obj.nextInt();
				obj.close();

				if(answer2 == 1) {
					System.out.println("Correct");
					score = score + 50;
				} else {
					System.out.println("Wrong!");
				}
				
				//print score
				System.out.println(score);
			}
			
		

		// TODO Auto-generated method stub

	}


