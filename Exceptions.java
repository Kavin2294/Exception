package qeagleAssignment1;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exceptions {

	public static void main(String[] args) {


		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("visual_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		WebElement click = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
		click.click();
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("agruments[0].click();", click);
		String price = driver.findElement(By.className("inventory_details_price")).getText();
		System.out.println("Price of Backpack "+price);
		//String addToCart = driver.findElement(By.xpath("//button[text()='Add to cart']")).getText();
		driver.findElement(By.id("add-to-cart")).click();
		//driver.switchTo().frame(0);
		driver.findElement(By.className("shopping_cart_badge")).click();
		driver.findElement(By.xpath("//button[text()='Continue Shopping']/following::button")).click();
		driver.findElement(By.id("first-name")).sendKeys("Leaf");
		driver.findElement(By.id("last-name")).sendKeys("Test");
		driver.findElement(By.name("postalCode")).sendKeys("600114");
		driver.findElement(By.xpath("//button[text()='Cancel']/following-sibling::input")).click();
		String sauceCard = driver.findElement(By.xpath("//div[text()='Payment Information:']/following-sibling::div")).getText();
		System.out.println(sauceCard);
		driver.findElement(By.id("finish")).click();
	}

	private static JavascriptExecutor JavascriptExecutor(ChromeDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}




}


	
	
	

