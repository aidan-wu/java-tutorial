public class App {
	public static void main(String[] args) {
          App test = new App();
		  String[][] words = new String[2][3];
		  
		  words[0][0] = "Hi";
		  words[0][1] = "Hello There";
		  words[0][2] = "Herro";
		  words[1][0] = "Sup";
		  words[1][1] = "Penguins";
		  words[1][2] = "Chicken";
		  test.print(words);
		  
		  String[][] members = {
				  {"I"},
				  {"Love All"},
				  {"My Family Members"}
		  };
		  
		  System.out.println("");
		  System.out.println("");
		  System.out.println("");
		  
		 
		  test.print(members);  
		  

		}
	
	
	public void print(String[][] words) {
	       for (int i=0; i<words.length; i++){
	    	   String result = "";
	            for (int j =0; j<words[i].length; j++){
	            	result = result + words[i][j];
	            }
	            printer(result, 30, "*");
	            
	        }
		}
	
	
	
	static void printer(String str, int size, String repeatedChar) {
	    int left = (size - str.length()) / 2;
	    int right = size - left - str.length();
	    StringBuffer buff = new StringBuffer();
	    for (int i = 0; i < left; i++) {
	        buff.append(repeatedChar);
	    }
	    buff.append(str);
	    for (int i = 0; i < right; i++) {
	        buff.append(repeatedChar);
	    }
	    // to see the end (and debug) if using spaces as repeatedChar
	    //buff.append("$");  
	    System.out.println(buff.toString());
	}

	
}