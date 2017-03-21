import java.util.Scanner;

class Reverse{
	public static void main(String[] args){
		int num = getNum();
		int rev_num = process(num);
		display(rev_num);
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
	
	public static void display(int reverse){
		System.out.println(" The reverse no. is " + reverse);
	}
}
