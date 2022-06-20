package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcelData;


public class ProjectSpecificMethods {

	public ChromeDriver driver;

	public String excelFileName;

	public static String leadID;

	public static String text;

	public static Properties prop1; 
	
	@DataProvider(indices = 0)
	public String[][] fetchData() throws IOException {
		return ReadExcelData.readData(excelFileName); //Read CreateLead,EditLead,DeleteLead,MergeLead & DuplicateLead

	}

	@BeforeMethod
	public void preCondition() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(new File (".//src/main//resources//application.properties"));
		prop.load(fis);
		String url = prop.getProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String lang = prop.getProperty("lang");
		prop1 = new Properties();
		FileInputStream fis1 = new FileInputStream(new File (".//src//main//resources//"+lang+".properties"));
		prop1.load(fis1);
	}

	@AfterMethod
	public void postCondition() {
		driver.close();

	}

}
