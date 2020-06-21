//This tests Login/Logout of 10 different users

package functional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class multipleLoginLogout {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\katie\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pmamhcm.com/");
		Thread.sleep(2000);
		String arr[][]={{"sales.demo@pmam.com","Dallas@2019"},{"ruser@pmam.com","Dallas@123"},{"support_test@pmam.com","Dallas@123"},{"lieutenant.smith@gmial.com","Dallas@2019"},{"peter.smith@gmial.com","dallas@123"},{"officer.smith@gmial.com","Dallas@2019"},{"smith.peter@gmial.com","dallas@2019"},{"captain.smith@gmial.com","Dallas@2019"},{"david.smith@gmial.com","Dallas@2019"},{"admin@pmam.com","dallas@2017"}};
		for(int i=0;i<arr.length;i++)
		{
		driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
		Actions action = new Actions(driver);
		WebElement move=driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
		action.moveToElement(move).build().perform();
		driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click().sendKeys(arr[i][0]).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click().sendKeys(arr[i][1]).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='logout']")).click();
		Thread.sleep(2000);
		driver.close();
		}
		
	}

}