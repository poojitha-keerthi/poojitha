import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class OneWeb {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver ObjDriver = new ChromeDriver();
		ObjDriver.get("http://demo.opencart.com");
		System.out.println("Open cart is loaded");
	String var1 = ObjDriver.getTitle();
	System.out.println("Title of the page"+var1);
WebElement obj1= ObjDriver.findElement(By.xpath("//html/body/footer/div/div/div[4]/Ul/li[1]/a"));
   obj1.click();
   WebElement obj2= ObjDriver.findElement(By.xpath("//*[@id=\'top-links']/ul/li[2]/ul/li[2]/a"));
   obj2.click();
   WebElement obj3= ObjDriver.findElement(By.xpath("//*[@id='input-email']"));
   obj3.sendKeys("obama@trump.com");
   WebElement obj4= ObjDriver.findElement(By.xpath("//*[@id='input-password']"));
   obj4.sendKeys("obama123");
}
}