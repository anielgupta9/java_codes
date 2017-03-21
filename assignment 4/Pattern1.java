class Pattern1{
	public static void main(String[] args){
		compute();
	}
	
	public static void compute(){
		for(int horizontal=0; horizontal <= 5; horizontal++){
			for(int vertical=0; vertical<horizontal; vertical++){
				System.out.print("* \t");
			}
			System.out.println("\n");
		}
	}
}
