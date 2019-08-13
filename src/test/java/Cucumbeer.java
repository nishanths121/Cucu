import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Cucumbeer {
 static WebDriver driver;
	
 @Given("user launch the browser")
	public void user_launch_the_browser() {
	//	 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\nishanth\\dri\\chromedriver.exe");
	//		driver=new ChromeDriver();
	//		 driver.get("http://demo.guru99.com/telecom/");
			// driver.manage().window().maximize();
	//		 driver.findElement(By.xpath("((//a[text()='Add Customer'])[1])")).click();
	//		 driver.findElement(By.xpath("//label[text()='Done']")).click();
	}

	@When("user click the add customer using sendkeys")
	public void user_click_the_add_customer_using_sendkeys() {
		System.out.println("using sendkeys");
		driver.findElement(By.id("fname")).sendKeys("ABC");
		driver.findElement(By.id("lname")).sendKeys("DEF");
		driver.findElement(By.id("email")).sendKeys("GHI@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Chennai");
		driver.findElement(By.id("telephoneno")).sendKeys("9874563210");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

	@When("user click the add customer using onedlist")
	public void user_click_the_add_customer_using_onedlist(DataTable onedlist) {
		List<String>one=onedlist.asList(String.class);
		System.out.println("OneDList");
		driver.findElement(By.id("fname")).sendKeys(one.get(1));
		driver.findElement(By.id("lname")).sendKeys(one.get(2));
		driver.findElement(By.id("email")).sendKeys(one.get(3));
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(one.get(4));
		driver.findElement(By.id("telephoneno")).sendKeys(one.get(5));
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	
	}

	@When("user click the add customer using onedmap")
	public void user_click_the_add_customer_using_onedmap(DataTable details) {
		Map<String,String>CusData= details.asMap(String.class,String.class);
		System.out.println("OneDMap");
	
	driver.findElement(By.id("fname")).sendKeys(CusData.get("fname"));
	driver.findElement(By.id("lname")).sendKeys(CusData.get("lname"));
	driver.findElement(By.id("email")).sendKeys(CusData.get("email"));
	driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(CusData.get("address"));
	driver.findElement(By.id("telephoneno")).sendKeys(CusData.get("phno"));
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

	@When("user click the add customer using twodlist")
	public void user_click_the_add_customer_using_twodlist(DataTable twodlist) {
		List<List<String>>two=twodlist.asLists(String.class);
		System.out.println("TwoDlist");
		driver.findElement(By.id("fname")).sendKeys(two.get(1).get(1));
		driver.findElement(By.id("lname")).sendKeys(two.get(1).get(2));
		driver.findElement(By.id("email")).sendKeys(two.get(1).get(3));
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(two.get(2).get(4));
		driver.findElement(By.id("telephoneno")).sendKeys(two.get(2).get(5));
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

	@When("user click the add customer using twodmap")
	public void user_click_the_add_customer_using_twodmap(DataTable details) {
		List<Map<String,String>>CusData=details.asMaps(String.class,String.class);
		System.out.println("TwoDMap");
	
	driver.findElement(By.id("fname")).sendKeys(CusData.get(0).get("fname"));
	driver.findElement(By.id("lname")).sendKeys(CusData.get(0).get("lname"));
	driver.findElement(By.id("email")).sendKeys(CusData.get(0).get("email"));
	driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(CusData.get(0).get("address"));
	driver.findElement(By.id("telephoneno")).sendKeys(CusData.get(0).get("phno"));
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

	@When("user clcik the add customer{string},{string},{string},{string},{string}")
	public void user_clcik_the_add_customer(String A, String B, String C, String D, String E) {
		System.out.println("finished");
		
			driver.findElement(By.id("fname")).sendKeys(A);
			driver.findElement(By.id("lname")).sendKeys(B);
			driver.findElement(By.id("email")).sendKeys(C);
			driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(D);
			driver.findElement(By.id("telephoneno")).sendKeys(E);
			driver.findElement(By.xpath("//input[@name='submit']")).click();
	}
	

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]")).isDisplayed());
		System.out.println("Successfully run the codes");
	}
}
