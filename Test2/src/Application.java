public class Application {
	public static void main(String[] args) {

		String[][] words = new String[2][3];
		
		words[0][0] = "Hi";
		words[0][1] = "Hello There";
		words[0][2] = "Herro";
		words[1][0] = "Sup";
		words[1][1] = "Penguins";
		words[1][2] = "Chicken";


		System.out.println(words[1][2]);
	}
}