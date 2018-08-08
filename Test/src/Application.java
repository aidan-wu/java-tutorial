
public class Application {
	public static void main(String[] args) {
		
		String input = "I live in Garden City";
		
		for(int i=input.length(); i>0 ; i--) {
	//		System.out.println(i);
			System.out.print(input.substring(i-1, i));
		}
		
		
		/*
		String[] text = new String[3];

		text[1] = "I live in Garden City";
		String[] words = {"I", "live", "in", "Garden", "City" };
		for(String word: words) {
			System.out.println(word);
		}
*/
		/*
		 * StringBuffer string = new StringBuffer(text); StringBuffer result =
		 * string.reverse(); System.out.println(result);
		 */
	}
}
