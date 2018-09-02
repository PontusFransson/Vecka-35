package vecka35;

public class uppg2 {

	public static void main(String[] args) {
		
		System.out.println(reverse("pontus"));

	}
	
	public static String reverse(String str){
		
		if(str.length() == 1){
			
			return str;
			
		} else {
			
			return reverse(str.substring(1)) + str.charAt(0);
			
		}
		
	}
	
}
