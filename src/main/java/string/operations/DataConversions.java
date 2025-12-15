package string.operations;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataConversions {

	public static void main(String[] args) {
		
		// Converting other data types to String ==> String.valueOf(data);
		int std = 144;
		int phone = 345323;
		String stdCode = String.valueOf(std);
		System.out.println(stdCode+phone);
		
		// Converting String to other data types ==> Integer.parseInt(String), Integer.valueOf(String)
		String balance = " Account Balance is : 9999.99$ ";
		balance = balance.replaceAll("[^0-9.]", ""); // Remove non-numeric characters
		double balValue = Double.parseDouble(balance);
		System.out.println(balValue>=10000);
		
		//Converting today's date and time to String 
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy hh:mm:ss");
		String dateString = sdf.format(Calendar.getInstance().getTime());
		System.out.println("Today's date and time: " + dateString);
		
	}

}
