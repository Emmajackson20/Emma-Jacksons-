import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in)
		System.out.println("Enter the marks: ");
		int marks = scanner .nextlnt();
		if (marks >= 90){
		System.out.println( "Excellent" );
		}
		else if (marks >= 80){
			System.out.println("Very good"); 
				}
			else if (marks >= 70){
			System.out.println("good"); 
				}
				else if (marks >= 60){
			System.out.println("Medium"); 
				}
			else if (marks >= 50){
			System.out.println("pass"); 
				}
			
						else {
			System.out.println("Fail"); 
				}			
	}
	
}