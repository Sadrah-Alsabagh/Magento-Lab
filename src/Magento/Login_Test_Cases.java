package Magento;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Test_Cases{
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	public void setup() {
		driver.get(Parameters.url);
		driver.manage().window().maximize();
	}
	
	@Test()
	public void login() {
	        // Navigate to the login page
		WebElement loginLink = driver.findElement(By.linkText("Sign In"));
		loginLink.click();	

		WebElement email = driver.findElement(By.id("email"));
		WebElement passwordField = driver.findElement(By.id("pass"));
        WebElement loginButton = driver.findElement(By.id("send2"));
//		  randomEmail = Parameters.randomEmail;
        String randomEmail = Signup_Test_Cases.randomEmail;
        String password = Parameters.password;
		email.sendKeys(randomEmail);
        passwordField.sendKeys(password);
        loginButton.click();
        
//        System.out.println("Email: " + randomEmail);

//        System.out.println("Password: " + password);
	}
	
	@AfterTest
	public void postTest() {}

	
}
