package frontend;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		int age = inputAge();
		System.out.println("Age " + age);
	}
	
	public static int inputAge() {
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			try {
				System.out.println("Enter an age: ");
				int age = sc.nextInt();
				sc.nextLine();
				
				if(age < 0) {
					System.out.println("Wrong input! The age must be greater than 0 . Please input again.");
				}else {
					return age;
				}
			}catch(Exception e) {
				System.out.println("Wrong input! Please input an age as an integer. Please input again.");
				sc.nextLine();
			}
		}
	}
}
