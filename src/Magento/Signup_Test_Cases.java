	package Magento;
	
	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.*;
	
	public class Signup_Test_Cases extends Parameters{
	
		WebDriver driver = new ChromeDriver();
		@BeforeTest
		public void setup() {
			driver.get(url);
			driver.manage().window().maximize();
		}
		
		@Test()
		public void signup() {
			WebElement createAccountLink = driver.findElement(By.linkText("Create an Account"));
			createAccountLink.click();
	//		Thread.sleep(5000);
			//Locate elements--> Inputs
			WebElement firstName = driver.findElement(By.id("firstname"));
			WebElement lastName = driver.findElement(By.id("lastname"));
			WebElement email = driver.findElement(By.id("email_address"));
			WebElement passwordField = driver.findElement(By.id("password"));
			WebElement confirmPassword = driver.findElement(By.id("password-confirmation"));
			WebElement SignupButton = driver.findElement(By.className("submit"));
	//		//Perform actions --> Send Keys
	//		   // Generate random data
	        String randomFirstName = Parameters.randomFirstName;
	        String randomLastName =Parameters.randomLastName;
	        String randomEmail = Parameters.randomEmail;
	
	        // Fill the input fields
	        firstName.sendKeys(randomFirstName);
	        lastName.sendKeys(randomLastName);
	        email.sendKeys(randomEmail);
	        passwordField.sendKeys(password); 
	        confirmPassword.sendKeys(password); 
	        SignupButton.click();
	System.out.println("First Name: " + randomFirstName);
	
	System.out.println("Last Name: " + randomLastName);
	//
	System.out.println("Email: " + randomEmail);
	
	      System.out.println("Password: " + password);
	
		}
		
		@AfterTest
		public void postTest() {
	//		driver.quit();
	
		}
	}
