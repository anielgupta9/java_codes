import java.util.Scanner;

class Eligibility{
	public static void main(String[] args){
		int age = getAge();
		boolean eligibility = process(age);
		display(eligibility);	
	}
	
	public static int getAge(){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the age: ");
		int age = sc. nextInt();
		return age;
	}
	
	public static boolean process(int age){
		boolean eligibility;
		if(age >= 16 && age <= 45){
			eligibility = true;
		}
		else{
			eligibility = false;
		}
		return eligibility;
	}
	
	public static void display(boolean eligibility){
		if(eligibility == true){
			System.out.println("You can go to the club. ");
		}
		else{
			System.out.println("You are not eligible to enter to the club.");
		}
	}
}
