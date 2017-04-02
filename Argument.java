class Argument{
	public static void main(String[] args){
		double avg = calculate_average(2.00,3.00);
		System.out.println(avg);
	}

	public static double calculate_average(double num1, double num2){
		double average = (num1 + num2)/2;
		return average;
	}
}
