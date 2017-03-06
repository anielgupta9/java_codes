public class grade{
	public static void main(String[] args){
		int marks=770;
		if(marks >= 0 && marks<40){
			System.out.println("Fail");
		}
		else if(marks >= 40 && marks <=50){
			System.out.println("Third Division");
		}
		else if(marks >=  50 && marks < 60){
			System.out.println("Second Division");
		}
		else if(marks >= 60 && marks < 80){
			System.out.println("First Division");
		}
		else if(marks >= 80 && marks < 100){
			System.out.println("Distinction");
		} 
		else{
			System.out.println("invalid Marks");
		}
	}
} 
