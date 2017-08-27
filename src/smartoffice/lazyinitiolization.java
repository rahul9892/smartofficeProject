package smartoffice;

public class lazyinitiolization {
	
	private static lazyinitiolization initial;
	
	private lazyinitiolization(){
		
	}
	public static lazyinitiolization getInstance(){
		
		if(initial==null){
			initial=new lazyinitiolization();
		}
		return initial;
	}

		
	public void met1(){
		System.out.println("met1 print");
	}
	
	public int metadata(){
		return 10;
		
	}
}
