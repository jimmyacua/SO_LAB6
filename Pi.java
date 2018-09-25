public class Pi {
	public static void main(String [] args){
		 double pi = 0.0;
    		double den = 1.0;
    		for(int i=0; i<1000000; i++){
        		if(i%2 == 0){
            			pi += (1/den);
        		} else{
            			pi -= (1/den);
        		}
        		den = den + 2.0;
    		}
    		pi = pi*4;
		System.out.println(pi);			
	}
}
