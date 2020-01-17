import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) 
	{
		
    	System.setProperty("webdriver.chrome.driver","C://Users//admin//Downloads//chromedriver.exe");
    	WebDriver ObjDriver = new ChromeDriver();
    	ObjDriver.get("https://demo.opencart.com/");
    	ObjDriver.manage().window().maximize();
    	ObjDriver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button/span")).click();
    	ObjDriver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/ul/li[3]/button")).click();
    	ObjDriver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[1]/span")).click();
    	ObjDriver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/i")).click();
    	WebElement Obj = ObjDriver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[6]"));
    	System.out.println(Obj.getText());
    	
    	float euros;
    	
    	  Scanner in = new Scanner(System.in);
    	  System.out.println("please enter euros:");
    	   euros = in.nextLong();
    	   float rupees = euros * 79;
    	   System.out.println(rupees  + "Rupees");
	}

}
	


