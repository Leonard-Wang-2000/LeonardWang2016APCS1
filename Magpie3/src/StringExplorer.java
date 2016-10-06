
public class StringExplorer {

	public static void main(String[] args) {
		String sample = "The quick brown fox jumped over the lazy dog.";

		// Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println("sample.indexOf(\"quick\") = " + position);

		// Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println("sample.toLowerCase() = " + lowerCase);
		System.out.println("After toLowerCase(), sample = " + sample);

		// IndexOf method thats overrided with 2 paramters, starts looking for the String at the 14th term
		int position2 = sample.indexOf("o", 14);
		System.out.println(position2);

	}

}
