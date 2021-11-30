package by.epam.java_introduction.string;

/*В строке вставить после каждого символа 'a' символ 'b'*/

public class StringOrStringBuilder2 {

	public static void main(String[] args) {
		
		String str = "grammar sun java darida aqua";
		
		String result = str.replace("a", "ab");
		System.out.println(result);
	}
	
}
