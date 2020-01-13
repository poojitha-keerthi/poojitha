import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckButton  { 
      
	    public static void main(String[] args)
	    {
	System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	WebDriver ObjDriver = new ChromeDriver();
	ObjDriver.get("http://demo.automationtesting.in/Register.html");
	//*[@id="basicBootStrapForm"]
	WebElement check_button = ObjDriver.findElement(By.xpath("//*[@id='checkbox1']"));
	check_button.click();
	boolean status=check_button.isDisplayed();
	check_button.click();
	System.out.println("check button is Displayed >>"+status);
	boolean enabled_status=check_button.isEnabled();
	System.out.println("check button is Enabled >>"+enabled_status);
}
}
