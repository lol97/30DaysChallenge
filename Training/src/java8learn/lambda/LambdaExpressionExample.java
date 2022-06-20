package java8learn.lambda;

interface Storable {
	public void store();
}

public class LambdaExpressionExample {
	public static void main(String[] args) {
		Storable st = ()->{
			int data = 1;
			String ayam = "petok";
			System.out.println(ayam + " " + data);
		};
		st.store();
		//return "petok 1"
	}
}
