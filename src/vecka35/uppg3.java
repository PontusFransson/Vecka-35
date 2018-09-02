package vecka35;

public class uppg3 {

	public static void main(String[] args) {
		
		Integer[] arr = arr(1,312,312,321,312,312,4,12,521,312,31,23,123,12);
		
		for (Integer integer : arr) {
			System.out.println(integer);
		}
		
	}

	@SafeVarargs
	public static <T> T[] arr(T... arr) {

		return arr;

	}
	
}
