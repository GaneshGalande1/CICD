import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchSecificWindow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(WebElement ele:links)
		{ String n=null;
		
		System.out.println("All links on amezon home page:"+ele.getText());
			if(ele.getAttribute("href")== null)
			{
				System.out.println("broken links are : "+ele.getText());
			}
		}
		
		
	}

}
