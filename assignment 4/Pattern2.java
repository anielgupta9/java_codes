class Pattern2{
	public static void main(String[] args){
		compute();
	}
	
	public static void compute(){
		for(int horizontal=5; horizontal >0; horizontal--){
			for(int vertical=horizontal; vertical>0; vertical--){
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
}
