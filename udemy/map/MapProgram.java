import java.util.Map;
import java.util.HashMap;

public class MapProgram {

	public static void main(String[] args) {

		Map<String, String> languages = new HashMap<>();
		if(languages.containsKey("java")) {
			System.out.println("java already exists in the map");
		}
		else {
			languages.put("java", "a compiled, high-lvl, object-oriented, platform independant language");
		}
		languages.put("phyton", "phyton.....ddffg");
		languages.put("Algol", "an algorithmic...");
		languages.put("BASIC", "Beginners All purpose Symbolic Instruction Code");

		//when there is no value yet, put returns null
		// System.out.println(languages.put("Lisp", "Therein lies madness"));

		// System.out.println(languages.get("java"));
		//will override the current value and return the old one
		// System.out.println(languages.put("java", "this course is about java"));

		//overrides 1st put
		// System.out.println(languages.get("java"));

		if(languages.keySet().size() > 0) {
			//do nothing
		}

		if(languages.containsKey("java")) {
			System.out.println("java is already in the map");
		}
		else {
			languages.put("java", "this course is about java");
		}

		languages.remove("java");
		languages.putIfAbsent("java", "java inserted by putIfAbsent Map method");
		System.out.println(languages.get("java"));

		System.out.println("--------------");		

		//remove returns true or false
		// languages.remove("Algol");
		//OR
		// languages.remove("Algol", "an algorithmic...");

		languages.replace("Algol", "dsfdsfsfsfsdfdsf");

		for(String key : languages.keySet()) {
			System.out.println(key + ": " + languages.get(key));
		}
	}
}