package qaanalyst.ExtentReportmavenusing;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExtentReportDemo {
	
	
	ExtentReports extent;
	
	@BeforeTest
	public void config()
	{
		
			String path=System.getProperty("user.dir")+"\\reports\\index.html";
			ExtentSparkReporter reporter=new ExtentSparkReporter(path);
			reporter.config().setReportName("web automantion results");
			reporter.config().setDocumentTitle("Test Results");
			
			
			extent=new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("Tester", "Thimmesh");
					
	}

	
@Test
	public void initialDemo()
	
	{
	extent.createTest("initialDemo");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Thimmesh\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		extent.flush();

	}	
}
