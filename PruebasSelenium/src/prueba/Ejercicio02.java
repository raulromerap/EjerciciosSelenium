package prueba;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class Ejercicio02 {

	@Test
	void testValido01() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://elenarivero.github.io/Ejercicio2/index.html");
		
		WebElement numBox = driver.findElement(By.id("numero"));
		WebElement dirBox = driver.findElement(By.id("directivo"));
		WebElement subButton = driver.findElement(By.xpath("//p/input[@type='submit']"));
		
		numBox.sendKeys("200");
		dirBox.sendKeys("+");
		subButton.click();
	}

	@Test
	void testValido02() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://elenarivero.github.io/Ejercicio2/index.html");
		
		WebElement numBox = driver.findElement(By.id("numero"));
		WebElement dirBox = driver.findElement(By.id("directivo"));
		WebElement subButton = driver.findElement(By.xpath("//p/input[@type='submit']"));
		
		numBox.sendKeys("001");
		dirBox.sendKeys("+");
		subButton.click();
	}
	
	@Test
	void testValido03() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://elenarivero.github.io/Ejercicio2/index.html");
		
		WebElement numBox = driver.findElement(By.id("numero"));
		WebElement dirBox = driver.findElement(By.id("directivo"));
		WebElement subButton = driver.findElement(By.xpath("//p/input[@type='submit']"));
		
		numBox.sendKeys("152");
		dirBox.sendKeys("+");
		subButton.click();
	}
	
	@Test
	void testValido04() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://elenarivero.github.io/Ejercicio2/index.html");
		
		WebElement numBox = driver.findElement(By.id("numero"));
		WebElement dirBox = driver.findElement(By.id("directivo"));
		WebElement subButton = driver.findElement(By.xpath("//p/input[@type='submit']"));
		
		numBox.sendKeys("999");
		dirBox.sendKeys("+");
		subButton.click();
	}
	
	@Test
	void testNoValido01() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://elenarivero.github.io/Ejercicio2/index.html");
		
		WebElement numBox = driver.findElement(By.id("numero"));
		WebElement dirBox = driver.findElement(By.id("directivo"));
		WebElement subButton = driver.findElement(By.xpath("//p/input[@type='submit']"));
		WebElement dirError = driver.findElement(By.id("errorDirectivo"));
		
		numBox.sendKeys("200");
		dirBox.sendKeys("");
		subButton.click();
		dirError.isDisplayed();
	}

	@Test
	void testNoValido02() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://elenarivero.github.io/Ejercicio2/index.html");
		
		WebElement numBox = driver.findElement(By.id("numero"));
		WebElement dirBox = driver.findElement(By.id("directivo"));
		WebElement subButton = driver.findElement(By.xpath("//p/input[@type='submit']"));
		WebElement dirError = driver.findElement(By.id("errorDirectivo"));
		
		numBox.sendKeys("200");
		dirBox.sendKeys("-+");
		subButton.click();
		dirError.isDisplayed();
		
		//Falla codigo, recoge más de 1 digito en el directivo
	}
	
	@Test
	void testNoValido03() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://elenarivero.github.io/Ejercicio2/index.html");
		
		WebElement numBox = driver.findElement(By.id("numero"));
		WebElement dirBox = driver.findElement(By.id("directivo"));
		WebElement subButton = driver.findElement(By.xpath("//p/input[@type='submit']"));
		WebElement dirError = driver.findElement(By.id("errorDirectivo"));
		
		numBox.sendKeys("200");
		dirBox.sendKeys("/");
		subButton.click();
		dirError.isDisplayed();
	}
	
	@Test
	void testNoValido04() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://elenarivero.github.io/Ejercicio2/index.html");
		
		WebElement numBox = driver.findElement(By.id("numero"));
		WebElement dirBox = driver.findElement(By.id("directivo"));
		WebElement subButton = driver.findElement(By.xpath("//p/input[@type='submit']"));
		WebElement dirError = driver.findElement(By.id("errorDirectivo"));
		
		numBox.sendKeys("200");
		dirBox.sendKeys("d");
		subButton.click();
		dirError.isDisplayed();
		
	}
	
	@Test
	void testNoValido05() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://elenarivero.github.io/Ejercicio2/index.html");
		
		WebElement numBox = driver.findElement(By.id("numero"));
		WebElement dirBox = driver.findElement(By.id("directivo"));
		WebElement subButton = driver.findElement(By.xpath("//p/input[@type='submit']"));
		WebElement dirError = driver.findElement(By.id("errorDirectivo"));
		
		numBox.sendKeys("200");
		dirBox.sendKeys("1");
		subButton.click();
		dirError.isDisplayed();

	}

	
	@Test
	void testNoValido06() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://elenarivero.github.io/Ejercicio2/index.html");
		
		WebElement numBox = driver.findElement(By.id("numero"));
		WebElement dirBox = driver.findElement(By.id("directivo"));
		WebElement subButton = driver.findElement(By.xpath("//p/input[@type='submit']"));
		WebElement numError = driver.findElement(By.id("errorNumero"));
		
		numBox.sendKeys("");
		dirBox.sendKeys("-");
		subButton.click();
		numError.isDisplayed();
	}
	
	@Test
	void testNoValido07() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://elenarivero.github.io/Ejercicio2/index.html");
		
		WebElement numBox = driver.findElement(By.id("numero"));
		WebElement dirBox = driver.findElement(By.id("directivo"));
		WebElement subButton = driver.findElement(By.xpath("//p/input[@type='submit']"));
		WebElement numError = driver.findElement(By.id("errorNumero"));
		
		numBox.sendKeys("000");
		dirBox.sendKeys("+");
		subButton.click();
		numError.isDisplayed();
		
		// Fallo de codigo, no sale el mensaje de error y deja valido el numero 000, debe empezar por 001
	}
	
	@Test
	void testNoValido08() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://elenarivero.github.io/Ejercicio2/index.html");
		
		WebElement numBox = driver.findElement(By.id("numero"));
		WebElement dirBox = driver.findElement(By.id("directivo"));
		WebElement subButton = driver.findElement(By.xpath("//p/input[@type='submit']"));
		WebElement numError = driver.findElement(By.id("errorNumero"));
		
		numBox.sendKeys("1000");
		dirBox.sendKeys("+");
		subButton.click();
		numError.isDisplayed();
		
		
	}
	
	@Test
	void testNoValido09() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://elenarivero.github.io/Ejercicio2/index.html");
		
		WebElement numBox = driver.findElement(By.id("numero"));
		WebElement dirBox = driver.findElement(By.id("directivo"));
		WebElement subButton = driver.findElement(By.xpath("//p/input[@type='submit']"));
		WebElement numError = driver.findElement(By.id("errorNumero"));
		
		numBox.sendKeys("7up");
		dirBox.sendKeys("+");
		subButton.click();
		numError.isDisplayed();
		
		
	}
	
	@Test
	void testNoValido010() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://elenarivero.github.io/Ejercicio2/index.html");
		
		WebElement numBox = driver.findElement(By.id("numero"));
		WebElement dirBox = driver.findElement(By.id("directivo"));
		WebElement subButton = driver.findElement(By.xpath("//p/input[@type='submit']"));
		WebElement numError = driver.findElement(By.id("errorNumero"));
		
		numBox.sendKeys("1.23");
		dirBox.sendKeys("+");
		subButton.click();
		numError.isDisplayed();
		
	}
	
	@Test
	void testNoValido011() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://elenarivero.github.io/Ejercicio2/index.html");
		
		WebElement numBox = driver.findElement(By.id("numero"));
		WebElement dirBox = driver.findElement(By.id("directivo"));
		WebElement subButton = driver.findElement(By.xpath("//p/input[@type='submit']"));
		WebElement numError = driver.findElement(By.id("errorNumero"));
		
		numBox.sendKeys("12@");
		dirBox.sendKeys("+");
		subButton.click();
		numError.isDisplayed();
		
		
	}
}
