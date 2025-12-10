package framework.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class DBUtil {
	
	static Properties prop = PropUtil.readData("Config.properties");
	
	//Common method to connect with database and get the raw data from the database tables.
	public static ResultSet executeQuery(String query) throws SQLException {		
		ResultSet dataSet = null;
		String username = prop.getProperty("DB_USER");
		String password = prop.getProperty("DB_PASSWORD");
		String url = prop.getProperty("DB_URL");
		Connection connection = DriverManager.getConnection(url, username, password);
		dataSet = connection.createStatement().executeQuery(query);
		return dataSet;	
	}
	
	//Common method to convert the raw data into a list of maps.(Each map contains one row data, like that multiple rows together in one list.)
	public static List<Map<String, String>> getData(String query) throws SQLException {
				
		//create a empty list of maps.
		List<Map<String, String>> data = new ArrayList<>();
		
		//get the raw data from database.
		ResultSet rs = executeQuery(query);
		
		//convert the raw data into list of maps.
		while(rs.next()) { //if there is data present in the ResultSet, go to next row
			
			//create a empty map for each row.
			Map<String, String> rowData =  new HashMap<String, String>();
						
			//Convert the resultset into map.
			for(int c=1;c<=rs.getMetaData().getColumnCount(); c++) {
				String columnName = rs.getMetaData().getColumnName(c);
				String columnValue = rs.getString(c);
				rowData.put(columnName, columnValue);				
			}
			
			//add each row data into list
			data.add(rowData);						
				
		}	

		return data;
	}
	
	
	public static void main(String[] args) throws SQLException {
		
		String query ="SELECT FILM.TITLE AS MOVIE_NAME, CATEGORY.NAME AS CATEGORY, LANGUAGE.NAME AS LANGUAGE FROM CATEGORY\r\n"
				+ "JOIN\r\n"
				+ "FILM_CATEGORY\r\n"
				+ "ON\r\n"
				+ "CATEGORY.CATEGORY_ID = FILM_CATEGORY.CATEGORY_ID\r\n"
				+ "JOIN\r\n"
				+ "FILM\r\n"
				+ "ON\r\n"
				+ "FILM_CATEGORY.FILM_ID = FILM.FILM_ID\r\n"
				+ "JOIN\r\n"
				+ "LANGUAGE\r\n"
				+ "ON\r\n"
				+ "FILM.LANGUAGE_ID = LANGUAGE.LANGUAGE_ID \r\n"
				+ "WHERE \r\n"
				+ "LANGUAGE.NAME = 'English' \r\n"
				+ "AND \r\n"
				+ "CATEGORY.NAME = 'Horror'\r\n"
				+ "AND \r\n"
				+ "FILM.TITLE LIKE '%Devil%'\r\n"
				+ "ORDER BY\r\n"
				+ "FILM.TITLE ASC\r\n"
				+ "LIMIT 10;\r\n"
				+ "";
		
		List<Map<String, String>> data = getData(query);
		System.out.println(data);
		System.out.println(data.get(0).get("movie_name"));
	}

}
