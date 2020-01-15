package control;

public class PrintPattern {

	public static void main(String[] args) {
				pattner1();
				System.out.println("\n*********************");
				pattner2();
				System.out.println("*********************");
				pattern3();
				System.out.println("*********************");
				patternA();
				System.out.println("*********************");
				patternB();
				System.out.println("*********************");
				patternC();
				System.out.println("*********************");
				patternD();
				System.out.println("*********************");
			}

			private static void pattner1() {
				for(int i = 1; i <= 6; i++) {
					System.out.print(i);
				}
			}
			
			private static void pattner2() {
				for(int i = 1; i <= 6; i++) {
					System.out.println(i);
				}
			}
			
			private static void pattern3() {
				for(int i = 1; i <= 6; i++) {
					//following for loop prints out 123456
					for(int j = 1; j <= 6; j++) {
						System.out.print(j);	
					}
					System.out.println();//breaks the line
				}
			}
			
			private static void patternA() {
				for(int i = 1; i <= 6; i++) {
					for(int j = 1; j <= i; j++) {
						System.out.print(j);	
					}
					System.out.println();
				}
			}
			
			private static void patternB() {
				for(int i = 1; i <= 6; i++) {
					for(int j = 1; j <= 7 - i; j++) {
						System.out.print(j);	
					}
					System.out.println();
				}
			}
			
			private static void patternC() {
				for(int i = 1; i <= 6; i++) {
					//this prints space in every line
					for(int j = 1; j <= 6-i; j++) {
						System.out.print(" ");	
					}			
					
					//this prints numbers in every line
					for(int j = i; j >= 1; j--) {
						System.out.print(j);	
					}
					System.out.println();
				}
			}
			
			private static void patternD() {
				for(int i = 1; i <= 6; i++) {
					//this prints space in every line
					for(int j = 1; j < i; j++) {
						System.out.print(" ");	
					}			
					
					//this prints numbers in every line
					for(int j = 1; j <= 7-i; j++) {
						System.out.print(j);	
					}
					System.out.println();
				}
		}
}


