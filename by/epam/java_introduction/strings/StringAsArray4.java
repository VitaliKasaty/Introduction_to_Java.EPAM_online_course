package by.epam.java_introduction.string;

/*В строке найти количество чисел*/

public class StringAsArray4 {
	
	public static void main(String[] args) {
		
		int count;
		
		String s = "jfhr639 f83 652 jfkslg 93 hh4dh38h h3s"; //числом считаю последовательность цифр до любого другого символа  
		count = countNumberOfString(s);
		System.out.println("Количество чисел в строке = " + count);

	}
	
	public static int countNumberOfString(String s) {
		
		int count = 0;
		char ch;
		boolean isSequenceNumber = false;
		
		for (int i = 0; i < s.length(); i++) { 
			ch = s.charAt(i);
			if (Character.isDigit(ch)) { //Если символ=цифра, то засекаем начало последовательности цифр
				isSequenceNumber = true;
			} 
			if (isSequenceNumber && !Character.isDigit(ch)) { //инкремент счётчика, когда закончится последовательность цифр
				isSequenceNumber = false;
				count++;
			}
		}	
		return count;		
	}

}
