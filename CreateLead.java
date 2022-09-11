package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();//setup browser  driver
ChromeDriver driver=new ChromeDriver();//launch browser
driver.get("http://leaftaps.com/opentaps/control/main/");//launch url

//driver.get("https://google.com/");//launch url
driver.manage().window().maximize();
WebElement username = driver.findElement(By.id("username"));
username.sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("hcool2ry2");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sreediyana1");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("govindaraj1");
//driver.findElement(By.className("smallSubmit")).click();

//driver.findElement(By.name("submitButton")).click();

//gets input text
//String fname = driver.findElement(By.id("createLeadForm_firstName")).getText();
//System.out.println(fname);
WebElement dd = driver.findElement(By.id("createLeadForm_dataSourceId"));
Select dd1=new Select(dd);
dd1.selectByValue("LEAD_CONFERENCE");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("deptit");
driver.findElement(By.id("createLeadForm_description")).sendKeys("i am happy");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sreediyana.it@gmail.com");
WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
//dropdown
Select statedd=new Select(state);
statedd.selectByVisibleText("New York");
driver.findElement(By.className("smallSubmit")).click();
//gets title
String title = driver.getTitle();
System.out.println(title);
//clicks duplicate link //assignment2
driver.findElement(By.linkText("Duplicate Lead")).click();
//getting entered text from company name
driver.findElement(By.id("createLeadForm_companyName")).clear();

driver.findElement(By.id("createLeadForm_companyName")).sendKeys("newcompname");
driver.findElement(By.id("createLeadForm_firstName")).clear();
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("clearedenteredvalue");
driver.findElement(By.className("smallSubmit")).click();
System.out.println(driver.getTitle());










}

}
