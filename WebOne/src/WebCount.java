import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebCount {

	public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
				WebDriver ObjDriver = new ChromeDriver();
				ObjDriver.get("http://demo.opencart.com");
			List<WebElement> links=ObjDriver.findElements(By.tagName("a"));
				
				//a link will go with Href
				//img will go with src
			System.out.println("Number of images"+links.size());
				for(WebElement ele:links)
				{
					System.out.println(ele.getAttribute("href"));
					}
				ObjDriver.close();
			}

		}
