package hello;

public class Greeting {

	private final long id;
	private final String content;
	
	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}
	
	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
	
	public int sumar(int num1, int num2) {
		return num1 + num2;
	}
	

}
