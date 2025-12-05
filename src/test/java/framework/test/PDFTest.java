package framework.test;

import framework.utilities.PDFUtil;

public class PDFTest {

	public static void main(String[] args) {

		String data = PDFUtil.readData("Data.pdf", 1, 1);
		System.out.println(data.contains("automating web applications"));
		System.out.println(data);
		
		String protectedData = PDFUtil.readProtectedPDF("Java.pdf", "Bharath123", 1, 1);
		System.out.println(protectedData);

	}

}
