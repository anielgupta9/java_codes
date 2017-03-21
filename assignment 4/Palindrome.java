import java.util.Scanner;

class Palindrome{
	public static void main(String[] args){
		int num = getNum();
		int rev_num = process(num);
		boolean result = compareNum(num, rev_num);
		display(result);
	}
	
	public static int getNum(){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc. nextInt();
		return num;
	}
	
	public static int process(int num){
		int rev=0, rem=0;
		while(num != 0){
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num/10;
		}
		return rev;
	}
	
	public static boolean compareNum(int num, int rev){
		boolean result;
		if(num==rev){
			result = true;
		}
		else{
			result = false;
		}
		return result;
	}
	
	public static void display(boolean result){
		if(result == true){
			System.out.println("The number is palindrome.");
		}
		else{
			System.out.println("The number is not palindrome.");
		}
	}	
}
