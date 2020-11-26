
public class Quiz2 {

	public static void main(String[] args) {
		
				// 1.
				System.out.println("1.");
					int max = 5;
					for (int n = 1; n <= max; n++) {
						    System.out.println(n);
						}
						System.out.println();
						
					int n=1;
					while (n<=max) {
							System.out.println(n);
							n++;
						}
						System.out.println();
						
					// 2.
					System.out.println("2.");
						int total = 25;
						for (int number = 1; number <= (total / 2); number++) {
						    total = total - number;
						    System.out.println(total + " " + number);
						}
						System.out.println();
						
						int total2=25;
						int number2=1;
						while (number2<=(total2/2)) {
							total2 = total2 - number2;
						    System.out.println(total2 + " " + number2);
						    number2++;
						}
						System.out.println();
						
					// 3.
					System.out.println("3.");
						for (int i = 1; i <= 2; i++) {
						    for (int j = 1; j <= 3; j++) {
						        for (int k = 1; k <= 4; k++) {
						            System.out.print("*");
						        }
						        System.out.print("!");
						    }
						    System.out.println();
						}
						System.out.println();
						
						int i=1;
						while(i<=2) {
							int j=1;
							while (j<=3) {
								int k=1;
								while (k<=4) {
									System.out.print("*");
									k++;
								}
								System.out.print("!");
								j++;
							}
							System.out.println();
							i++;
						}
						System.out.println();
						
						// 4.
						System.out.println("4.");
						int num = 4;
						for (int count = 1; count <= num; count++) {
						    System.out.println(num);
						    num = num / 2;
						}
						System.out.println();
						
						int num2=4;
						int count2=1;
						while (count2<=num2) {
							System.out.println(num2);
						    num2 = num2 / 2;
						    count2++;
						}
						
	}

}
