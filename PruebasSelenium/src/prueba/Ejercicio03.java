package prueba;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import dev.failsafe.internal.util.Assert;

class Ejercicio03 {
	
	static WebDriver driver = new FirefoxDriver();
	
	@Test
	void valido() {
		driver.get("https://elenarivero.github.io/ejercicio3/index.html");
		
		WebElement nameBox = driver.findElement(By.id("nomap"));
		WebElement dateBox = driver.findElement(By.id("fecha"));
		WebElement button = driver.findElement(By.xpath("//p/input[@type='submit']"));
		
		nameBox.sendKeys("Raul Romera Pavon");
		dateBox.sendKeys("31/12/2004");
		button.click();
		
		WebElement checkText = driver.findElement(By.tagName("h3"));
		String text = checkText.getText();
		assertEquals("Datos correctos", text);
		
	}

	@Test
	void noValido01() {
		driver.get("https://elenarivero.github.io/ejercicio3/index.html");
		
		WebElement nameBox = driver.findElement(By.id("nomap"));
		WebElement dateBox = driver.findElement(By.id("fecha"));
		WebElement button = driver.findElement(By.xpath("//p/input[@type='submit']"));
		
		nameBox.sendKeys("Raul Romera Pavon");
		dateBox.sendKeys("");
		button.click();
		
		WebElement error = driver.findElement(By.id("errorFecha"));
		boolean err = error.isDisplayed();
		
		assertTrue(err);
		
	}
	
	@Test
	void noValido02() {
		driver.get("https://elenarivero.github.io/ejercicio3/index.html");
		
		WebElement nameBox = driver.findElement(By.id("nomap"));
		WebElement dateBox = driver.findElement(By.id("fecha"));
		WebElement button = driver.findElement(By.xpath("//p/input[@type='submit']"));
		
		nameBox.sendKeys("Raul Romera Pavon");
		dateBox.sendKeys("2004/31/12");
		button.click();
		
		WebElement error = driver.findElement(By.id("errorFecha"));
		boolean err = error.isDisplayed();
		
		assertTrue(err);
		
	}
	
	@Test
	void noValido03() {
		driver.get("https://elenarivero.github.io/ejercicio3/index.html");
		
		WebElement nameBox = driver.findElement(By.id("nomap"));
		WebElement dateBox = driver.findElement(By.id("fecha"));
		WebElement button = driver.findElement(By.xpath("//p/input[@type='submit']"));
		
		nameBox.sendKeys("Raul Romera Pavon");
		dateBox.sendKeys("00/12/2004");
		button.click();
		
		WebElement error = driver.findElement(By.id("errorFecha"));
		boolean err = error.isDisplayed();
		
		assertTrue(err);
		
	}
	@Test
	void noValido04() {
		driver.get("https://elenarivero.github.io/ejercicio3/index.html");
		
		WebElement nameBox = driver.findElement(By.id("nomap"));
		WebElement dateBox = driver.findElement(By.id("fecha"));
		WebElement button = driver.findElement(By.xpath("//p/input[@type='submit']"));
		
		nameBox.sendKeys("Raul Romera Pavon");
		dateBox.sendKeys("32/12/2004");
		button.click();
		
		WebElement error = driver.findElement(By.id("errorFecha"));
		boolean err = error.isDisplayed();
		
		assertTrue(err);
		
		// Fallo porque el dia no tiene limite de dd<=31
	}
	@Test
	void noValido05() {
		driver.get("https://elenarivero.github.io/ejercicio3/index.html");
		
		WebElement nameBox = driver.findElement(By.id("nomap"));
		WebElement dateBox = driver.findElement(By.id("fecha"));
		WebElement button = driver.findElement(By.xpath("//p/input[@type='submit']"));
		
		nameBox.sendKeys("Raul Romera Pavon");
		dateBox.sendKeys("31/00/2004");
		button.click();
		
		WebElement error = driver.findElement(By.id("errorFecha"));
		boolean err = error.isDisplayed();
		
		assertTrue(err);
		
	}
	@Test
	void noValido06() {
		driver.get("https://elenarivero.github.io/ejercicio3/index.html");
		
		WebElement nameBox = driver.findElement(By.id("nomap"));
		WebElement dateBox = driver.findElement(By.id("fecha"));
		WebElement button = driver.findElement(By.xpath("//p/input[@type='submit']"));
		
		nameBox.sendKeys("Raul Romera Pavon");
		dateBox.sendKeys("31/13/2004");
		button.click();
		
		WebElement error = driver.findElement(By.id("errorFecha"));
		boolean err = error.isDisplayed();
		
		assertTrue(err);
		
	}
	@Test
	void noValido07() {
		driver.get("https://elenarivero.github.io/ejercicio3/index.html");
		
		WebElement nameBox = driver.findElement(By.id("nomap"));
		WebElement dateBox = driver.findElement(By.id("fecha"));
		WebElement button = driver.findElement(By.xpath("//p/input[@type='submit']"));
		
		nameBox.sendKeys("Raul Romera Pavon");
		dateBox.sendKeys("31/12/-0001");
		button.click();
		
		WebElement error = driver.findElement(By.id("errorFecha"));
		boolean err = error.isDisplayed();
		
		assertTrue(err);
		
	}
	@Test
	void noValido08() {
		driver.get("https://elenarivero.github.io/ejercicio3/index.html");
		
		WebElement nameBox = driver.findElement(By.id("nomap"));
		WebElement dateBox = driver.findElement(By.id("fecha"));
		WebElement button = driver.findElement(By.xpath("//p/input[@type='submit']"));
		
		nameBox.sendKeys("");
		dateBox.sendKeys("30/01/0000");
		button.click();
		
		WebElement error = driver.findElement(By.id("errorNomap"));
		boolean err = error.isDisplayed();
		
		assertTrue(err);
		
	}
	@Test
	void noValido09() {
		driver.get("https://elenarivero.github.io/ejercicio3/index.html");
		
		WebElement nameBox = driver.findElement(By.id("nomap"));
		WebElement dateBox = driver.findElement(By.id("fecha"));
		WebElement button = driver.findElement(By.xpath("//p/input[@type='submit']"));
		
		nameBox.sendKeys("1Raul");
		dateBox.sendKeys("01/02/0001");
		button.click();
		
		WebElement error = driver.findElement(By.id("errorNomap"));
		boolean err = error.isDisplayed();
		
		assertTrue(err);
		
	}
	@Test
	void noValido10() {
		driver.get("https://elenarivero.github.io/ejercicio3/index.html");
		
		WebElement nameBox = driver.findElement(By.id("nomap"));
		WebElement dateBox = driver.findElement(By.id("fecha"));
		WebElement button = driver.findElement(By.xpath("//p/input[@type='submit']"));
		
		nameBox.sendKeys("@Raul");
		dateBox.sendKeys("02/11/2004");
		button.click();
		
		WebElement error = driver.findElement(By.id("errorNomap"));
		boolean err = error.isDisplayed();
		
		assertTrue(err);
		
	}

}
