package framework.test;

import java.util.Properties;

import framework.utilities.PropUtil;

public class PropTest {

	public static void main(String[] args) {
		Properties prop = PropUtil.readData("Config.properties");
		System.out.println(prop.getProperty("dbURL"));
	}

}
