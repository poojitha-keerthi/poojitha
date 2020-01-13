import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver ObjDriver = new ChromeDriver();
		ObjDriver.get("http://demo.automationtesting.in/Register.html");
		//*[@id="basicBootStrapForm"]
		WebElement radio_button = ObjDriver.findElement(By.name("radiooptions"));
		radio_button.click();
	//List<WebElement> links=ObjDriver.findElements(By.xpath("//*[@id='basicBootstrapForm']/div[6]/div/div[1]/label"));
		
		//a link will go with Href
		//img will go with src
	//System.out.println("Number of buttons"+links.size());
		/*for(WebElement ele:links)
		{
			System.out.println(ele.getAttribute("href"));
			}
		ObjDriver.close();*/
	boolean status=radio_button.isDisplayed();
	radio_button.click();
	 System.out.println("radio button is Displayed >>"+status);
	boolean enabled_status=radio_button.isEnabled();
	System.out.println("radio button is Enabled >>"+enabled_status);
	boolean selected_status=radio_button.isSelected();
	System.out.println("radio button is Selected >>"+selected_status);
	radio_button.click();
	boolean selected_status_new=radio_button.isSelected();
	System.out.println("radio button is Selected >>"+selected_status_new);
	}
}
