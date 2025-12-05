package framework.test;

import java.util.List;
import java.util.Map;

import framework.utilities.ExcelUtil;

public class ExcelTest {

	public static void main(String[] args) {
		// Read data from Excel using ExcelUtil
		
		String [][] testData = ExcelUtil.readData("TestData.xlsx", "LoginFunctionality");
		
		//Print the data to verify
		System.out.println(testData[0][0]); //Print first row, first column
		
		//Print all data
		List<Map<String, String>> excelData = ExcelUtil.readExcelData("TestData.xlsx", "LoginFunctionality");
		System.out.println(excelData);

	}

}
