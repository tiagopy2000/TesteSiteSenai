package testsFront;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageHome {
	@Test
	public void testNavegarPaginaHome() {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.google.com/");

		WebElement searchBox = driver.findElement(By.cssSelector("input[title=Pesquisar]"));
		searchBox.sendKeys("senai mogi", Keys.ENTER);
		
		driver.findElement(By.cssSelector(".LC20lb")).click();
		
		driver.findElement(By.cssSelector("a[title='Bolsas de Estudo']")).click();
		
		driver.findElement(By.cssSelector("a[title='IMPLANTAÇÃO DE SERVIÇOS EM NUVEM - AWS CLOUD PRACTITIONER FOUNDATIONAL']")).click();
	}
}
