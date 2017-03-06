public class GreatestNumLogical{
	public static void main(String() args){
		int num1 = 2, num2 = 3, num3 = 9;
		if(num1 < num3 && num2 <num3){
			System.out.println(num3 + "is greates");
		}
		else if(num1 > num2 && num1 >num3){
			System.out.println(num1 + "is greatest");
		}
		else if(num2 > num1 && num2 > num3){
			System.out.println(num2 + "is greatest");
		}
		else{
			System.out.println("Equal numbers are prohibited!!!");
		}
	}
}
