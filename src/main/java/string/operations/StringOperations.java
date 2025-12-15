package string.operations;

public class StringOperations {

	public static void main(String[] args) {

		//Store String in a variable
		String value =" Username : Admin | Password : admin123 ";
		System.out.println("Original String:" + value);
		
		//Total number of characters available in the String ==> String.length()
		int length = value.length();
		System.out.println("Length of the String: " + length);
		
		//Get the specific character from a specific index within the string. ==> String.charAt(index)
		System.out.println("Character at index 5 (6th char): " + value.charAt(5));
		
		//Reverse the String
		String reversedString = "";
		
		for(int i=length-1; i>=0; i--) {
			reversedString = reversedString + value.charAt(i);
		}		
		System.out.println("Reversed String: " + reversedString);
		
		//Removing unwanted leading and trailing spaces ==> String.trim()
		System.out.println("Original String: '" + value+ "'");
		System.out.println("Trimmed  String: '" + value.trim() + "'");
		
		//Removing all spaces in between the string ==> String.replace(oldChar, newChar)
		String noSpacesString = value.replace(" ", "");
		System.out.println("String without spaces: '" + noSpacesString + "'");
		
		//Removing all alphabets in between the string ==> String.replaceAll(regExp, newChar)
		String noAlphabetsString = value.replaceAll("[a-zA-Z]", "");
		System.out.println("String without alphabets: '" + noAlphabetsString + "'");
		
		//Removing all numbers in between the string ==> String.replaceAll(regExp, newChar)
		String noNumbersString = value.replaceAll("[0-9]", "");
		System.out.println("String without numbers: '" + noNumbersString + "'");
		
		//Removing all special chars in between the string ==> String.replaceAll(regExp, newChar)
		String noSpecialCharsString = value.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println("String without special chars: '" + noSpecialCharsString + "'");
		
		//Convert the string to upper case ==> String.toUpperCase()
		String upperCaseString = value.toUpperCase();
		System.out.println("Upper case String: '" + upperCaseString + "'");
		
		//Convert the string to lower case ==> String.toLowerCase()
		String lowerCaseString = value.toLowerCase();
		System.out.println("Lower case String: '" + lowerCaseString + "'");
		
		// Extract substring from the string ==> String.substring(beginIndex, endIndex+1)
		String username = value.substring(12, 17);
		String password = value.substring(31);
		System.out.println("Extracted Username: '" + username + "'");
		System.out.println("Extracted Password: '" + password + "'");
		
		//Extract the substring from dynamic String ==> String.split(delimiter); //delimiter is any char
		String[] parts = value.split(" ");
		String dynamicUsername = parts[3];
		String dynamicPassword = parts[7];
		System.out.println("Dynamically Extracted Username: '" + dynamicUsername + "'");
		System.out.println("Dynamically Extracted Password: '" + dynamicPassword + "'");
		
		//Compare the Strings 
		//equals() ==> case sensitive comparison
		//equalsIgnoreCase() ==> case insensitive comparison
		//contains() ==> checks if a specific sequence of char is present in the string
		//startsWith() ==> checks if the string starts with a specific sequence of char
		//endsWith() ==> checks if the string ends with a specific sequence of char
		
		String name = "Bharath";
		System.out.println("Is name equal to 'bharath'? " + name.equals("bharath"));
		System.out.println("Is name equal to 'bharath' (ignore case)? " + name.equalsIgnoreCase("bharath"));
		System.out.println("Does name contain 'hara'? " + name.contains("hara"));
		System.out.println("Does name contain 'Hara'? " + name.contains("Hara"));
		System.out.println("Does name start with 'Bha'? " + name.startsWith("Bha"));
		System.out.println("Does name end with 'rath'? " + name.endsWith("rath"));
		
		//Verify if the String is empty or blank ==> String.isEmpty() (not even spaces allowed) , String.isBlank() (only spaces allowed)
		String emptyString = "";
		String blankString = "   ";
		System.out.println("Is emptyString empty? " + emptyString.isEmpty());
		System.out.println("Is blankString empty? " + blankString.isEmpty());
		System.out.println("Is emptyString blank? " + emptyString.isBlank());
		System.out.println("Is blankString blank? " + blankString.isBlank());
		
		//String concatenation ==> String.concat() or + operator
		String firstName = "Bharath";
		String lastName = "Reddy";
		String fullName1 = firstName.concat(" ").concat(lastName);
		String fullName2 = firstName + " " + lastName;
		System.out.println("Full Name using concat(): " + fullName1);
		System.out.println("Full Name using + operator: " + fullName2);
		
		//String vs StringBuffer vs StringBuilder
		
		//String is immutable (cannot be changed)
		//StringBuffer is mutable and synchronized (thread-safe)
		//StringBuilder is mutable and not synchronized (not thread-safe)
		
		String str = "Hello";
		StringBuffer sbf = new StringBuffer("Hello");
		StringBuilder sbl = new StringBuilder("Hello");
		
		System.out.println("Original String: " + str);
		System.out.println("Original StringBuffer: " + sbf);
		System.out.println("Original StringBuilder: " + sbl);
		
		//String is immutable (cannot be changed)
		str.concat(" ,World!");
		System.out.println("Updated String: "+str);
		
		//StringBuffer is mutable and synchronized (thread-safe)
		sbf.append(" ,World!");
		System.out.println("Updated StringBuffer: "+sbf);
		
		//StringBuilder is mutable and not synchronized (not thread-safe)
		sbl.append(" ,World!");
		System.out.println("Updated StringBuilder: "+sbl);
		
	}

}
