package useful.ex03;

public class DivideByZeroError extends Exception {
	
	private String customMsg; 
	
	public DivideByZeroError(String customMsg) {
		super(customMsg);
		this.customMsg = customMsg; 
	}
	
	public String getCustomMsg() {
		return customMsg;
	}
}
