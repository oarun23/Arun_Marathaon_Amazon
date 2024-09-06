package week2.marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60)); 

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement test = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='twotabsearchtextbox']")));
		test.sendKeys("Bag for boys");

		WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='nav-search-submit-button']")));
		searchButton.click();

		WebElement results = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")));

		System.out.println("Results, "+results.getText());


		WebElement checkBox1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//label/i[@class='a-icon a-icon-checkbox'])[4]")));
		checkBox1.click();

		WebElement checkBox2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//label/i[@class='a-icon a-icon-checkbox'])[4]")));
		checkBox2.click();

		WebElement sort = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='a-button a-button-dropdown a-button-small']")));
		sort.click();

		WebElement sortNew = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/a[@id='s-result-sort-select_4']")));
		sortNew.click();

		WebElement bagName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")));

		System.out.println("Bag Info:"+bagName.getText());

		WebElement bagPrice = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='a-row a-size-base a-color-base'])[1]")));

		System.out.println("Bag Price:"+bagPrice.getText());

		System.out.println("Web Page Title is, "+driver.getTitle());

		driver.close();





	}

}
