package MavenTestNGGitHubJenkins.MavenTestNGGitHubJenkinsArtID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class confirmationPopUpHandler 
{
	
	@Test
    public void confirmationPopUp() throws InterruptedException
    {

    	//verify SImple alert with ok button. Prompt alert with input text box/ok/cancel . Confirmation alert with checkbox/ok/cancel
 
			System.out.println("starting");
    		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shash\\eclipse-workspace\\JarFiles\\geckodriver-v0.18.0-win64\\geckodriver.exe");
    		WebDriver driver = new FirefoxDriver();
    		
    		driver.get("http://test1.absofttrainings.com/javascript-alert-confirm-prompt-boxes/");
    		//********************Open Simple alert and click ok 
    		Thread.sleep(2000);
    		driver.findElement(By.id("alert")).click();
    		//Reading Alert Text

    		Thread.sleep(2000);
    		System.out.println(driver.switchTo().alert().getText());
    		
    		//clicking Ok button on Alert
    		driver.switchTo().alert().accept();
    		Thread.sleep(3000);
    		System.out.println("clicked ALertBox OK button");
    		//printing msg appeared on the page after alert box is closed
    		System.out.println(driver.findElement(By.id("msg")).getText());

    	
    	
    		//********************Open Confirm box and click ok 
    				Thread.sleep(2000);
    				driver.findElement(By.id("confirm")).click();
    				//Reading confirm box Text

    				Thread.sleep(2000);
    				System.out.println(driver.switchTo().alert().getText());
    				
    				//clicking Ok button on Alert
    				driver.switchTo().alert().accept();
    				Thread.sleep(3000);
    				System.out.println("clicked ConfirmBox OK button");
    				//printing msg appeared on the page after alert box is closed
    				System.out.println(driver.findElement(By.id("msg")).getText());

    	
    	
    				//********************Open Prompt box,enter input and click Ok 
    				Thread.sleep(2000);
    				driver.findElement(By.id("prompt")).click();
    				//Reading Prompt box Text

    				Thread.sleep(2000);
    				System.out.println(driver.switchTo().alert().getText());
    				
    				//entering name in the input box of confirm box
    				System.out.println("Entering Name in Input Box of COnfirmation PopUp");
    				String Name = "Shashank Chaturvedi";
    				driver.switchTo().alert().sendKeys(Name);
    				Thread.sleep(3000);
    				
    				//clicking Ok button on Alert
    				driver.switchTo().alert().accept();
    				Thread.sleep(3000);
    				System.out.println("clicked PromptBox OK button");
    				//printing msg appeared on the page after alert box is closed
    				System.out.println(driver.findElement(By.id("msg")).getText());

    				
    				//********************Open Prompt box,enter input and click Cancel 
    				Thread.sleep(2000);
    				driver.findElement(By.id("prompt")).click();
    				//Reading Prompt box Text

    				Thread.sleep(2000);
    				System.out.println(driver.switchTo().alert().getText());
    				
    				//entering name in the input box of confirm box
    				System.out.println("Entering Name in Input Box of COnfirmation PopUp");
    				driver.switchTo().alert().sendKeys(Name);
    				Thread.sleep(3000);
    				

    				driver.quit();				
    				
    				System.out.println("completed");
    }
	
	@Test
    public void printMsg() throws InterruptedException
    {
		System.out.println("i am in secondmethod 111112222");
    }
}
