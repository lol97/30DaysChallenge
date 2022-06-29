package simplilearn.learnenum;

public class TestEnum {
	public static void main(String[] args) {
		Color color = Color.RED;
		System.out.println(color.name());
		System.out.println(color.getValue());
		
		for(Color col: Color.values()) {
			System.out.println("enum value : "+col.getValue());
		}

	}
}
