package simplilearn.learnenum;

public enum Color {
	RED("red"), GREEN("green"), BLUE("blue");
	
	private String value;

	Color(String string) {
		this.value = string;
	}

	public String getValue() {
		return value;
	}
	
}
