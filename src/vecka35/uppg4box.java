package vecka35;

public class uppg4box <T>{

	T[] stuff;
	
	@SafeVarargs
	public uppg4box(T... stuff){
		this.stuff = stuff;
	}
	
}
