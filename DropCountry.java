import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropCountry 
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	WebDriver ObjDriver = new ChromeDriver();
	ObjDriver.get("http://demo.automationtesting.in/Register.html");
	WebElement country_dropdown = ObjDriver.findElement(By.xpath("//*[@id='Country']"));
	Select country=new Select(country_dropdown);
	List<WebElement>  dropdown=country.getOptions();
	for(int i=0;i<dropdown.size();i++)
	{
		String drop_down_values=dropdown.get(i).getText();
		System.out.println("dropdown values are country sets "+drop_down_values);
	}
	}
}