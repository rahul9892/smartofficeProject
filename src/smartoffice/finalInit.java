package smartoffice;

public class finalInit {
	public static void main (String[] args){
		
		lazyinitiolization t1=lazyinitiolization.getInstance();
		t1.met1();
		lazyinitiolization test3=lazyinitiolization.getInstance();
		int vari=test3.metadata();
		System.out.println(vari);
	}

}
