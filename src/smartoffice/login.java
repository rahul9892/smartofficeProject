package smartoffice;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;


public class login {
	static WebElement pass=null;
	
public static void main(String[]args) throws InterruptedException	{	
	WebDriver driver=new FirefoxDriver();
	driver.get("https://pmgcloud.ez-data.com/qa2/index.htm");
	
	/*Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
			.withTimeout(1, TimeUnit.MINUTES)
			.pollingEvery(1, TimeUnit.SECONDS)
			.ignoring(NoSuchElementException.class);
	pass=wait.until(new Function<WebDriver,WebElement>(){

		@Override
		public WebElement apply(WebDriver driver) {
			// TODO Auto-generated method stub
			return driver.findElement(By.id("identifierId"));
		}
		
	});*/
	
//	pass=driver.findElement(By.id("identifierId"));
//	pass.sendKeys("rbrahulbarapatre@gmail.com");
	Thread.sleep(8000);
	driver.switchTo().frame("MainFrame");
	Wait<WebDriver> wait =new FluentWait<WebDriver>(driver)
		.withTimeout(50, TimeUnit.SECONDS)
		.pollingEvery(2, TimeUnit.SECONDS)
		.ignoring(NoSuchElementException.class);
		pass=wait.until(new Function<WebDriver, WebElement>(){

		@Override
		public WebElement apply(WebDriver driver) {
			// TODO Auto-generated method stub
			return driver.findElement(By.id("Office"));
		}
			
		});
	Actions act=new Actions(driver);
	//act.doubleClick(pass).build().perform();
	
	//driver.switchTo().frame("MainFrame");
	
	//------------------------------------------this line of code is to perform right click on an element--------------------
	
	//JavascriptExecutor js= (JavascriptExecutor)driver;
	//js.executeScript("document.getElementById('Office').value='rahulqa2'");
	//act.moveToElement(pass).contextClick().perform();
//	act.contextClick()
	//------------------------------------------above line of code to perform right click on an element--------------------
	
	
	//-------------------Below code is to get the width and height of the text box or any other field----------------------
System.out.println(driver.findElement(By.id("remember")).getSize().getWidth());
	driver.findElement(By.id("Office")).sendKeys("avinashqa2");
	driver.findElement(By.id("User")).sendKeys("admin");
	driver.findElement(By.id("Pwd")).sendKeys("ecpdemo1");
	driver.findElement(By.id("submit")).click();
	

	Thread.sleep(15000);	
	driver.switchTo().defaultContent();
	//driver.switchTo().frame("MainFrame");
	driver.findElement(By.id("menuCalendar")).click();
	Thread.sleep(2000);	
driver.findElement(By.id("menuDayView")).click();
Thread.sleep(2000);
Set<String> getwindow=driver.getWindowHandles();

getwindow.forEach(value->driver.switchTo().window(value)
		//driver.findElement(By.id("contactId"))
		);

for(String win:getwindow){
	driver.switchTo().window(win);
	driver.switchTo().defaultContent();
	driver.switchTo().frame("MainFrame");
	if(driver.findElements(By.id("720906")).size()>0){
		
		driver.findElement(By.id("720906")).click();
		
	}
}

int si=getwindow.size();
driver.switchTo().window(getwindow.toString());
/*Iterator It=getwindow.iterator();
Object mainWin=It.next();
String ob=(String) It.next();*/
//boolean it=getwindow.iterator().hasNext();



//driver.switchTo().window(ob);

//driver.switchTo().window();
driver.findElement(By.id("720905")).getText();
driver.findElement(By.id("cmdSearchPeople")).click();

	Thread.sleep(5000);	
	List<WebElement> modal=driver.findElements(By.tagName("iframe"));
	driver.switchTo().defaultContent();

	driver.switchTo().frame(modal.size()-1);
	driver.switchTo().frame("ebRealModal");
		
	driver.findElement(By.id("both_nm")).sendKeys("test123");
	
	}
}
