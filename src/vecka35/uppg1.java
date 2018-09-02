package vecka35;

public class uppg1{

	public static void main(String[] args) {
		
		System.out.println(nummersumma(1,2,3,4,123213,213,12312,3,123,123,21,31,312,312,312,321,3,123,213));
		
	}
	
	public static int nummersumma(int... siffror){
		
		int nummersumma = 0;
		
		for (int i : siffror) {
			nummersumma += i;
		}
		
		return nummersumma; 
		
	}
	
	
	
}
