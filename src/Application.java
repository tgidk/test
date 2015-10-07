import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("dog");
		list.add("cat");

		String animal = list.get(0);
		
		System.out.println(animal);

	}

}
	