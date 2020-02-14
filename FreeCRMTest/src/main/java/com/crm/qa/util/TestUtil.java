package com.crm.qa.util;


import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.crm.qa.base.TestBase;
import java.sql.ResultSetMetaData;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TestUtil extends TestBase{
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;
	
	public static String TESTDATA_SHEET_PATH = "C:\\Users\\DELL\\git\\TestProject\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\testData\\freeCRMtest.xlsx";
	
	public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc.mysql://localhost:3306/freecrm";
	
	static Connection con = null;
	static Statement stmt = null;
	
		
	public static Object[][] getTestData(String tableName) throws Exception{
		Object[][] data;
	
		Class.forName(JDBC_DRIVER);
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/freecrm", "root",  "Gtyhnbvfr@1");
		stmt = con.createStatement();
		String sql =  "select * from "+ tableName; 
		ResultSet rs = stmt.executeQuery(sql);
		ResultSetMetaData rsmd = rs.getMetaData();
		rs.last();
		int rows = rs.getRow();
		int columns = rsmd.getColumnCount();
		rs.first();
		data = new Object[rows][columns];
		int j=0;
		while(j<rows) {
			for(int i=0; i<columns; i++) {
				data[j][i] = rs.getString(i+1);
			}
			rs.next();
			j++;
		}
		rs.close();
		stmt.close();
		con.close();
		return data;
		
	}
	
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}
}
