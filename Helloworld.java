import java.util.Scanner;
class PrimeNumber{
	public static void main(String a[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to search its an prime or not");
		int number = scan.nextInt();
		for(int i=1; i<=number; i++){
			if(number%i==0 && number%1==0){
				System.out.println("the given number is an Prime Number: "+ number);
			}
			else{
				System.out.println("the given number is not an prime number: "+ number);
			}
		}
	}
}
