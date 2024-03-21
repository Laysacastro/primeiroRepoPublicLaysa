package Metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class MetodosLoginPage {

	WebDriver navegador;
	
	public void abrirNavegador(String url) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		navegador = new ChromeDriver();
		navegador.manage().window().maximize();
		navegador.get(url);
	}
	
	public void clicar(By elemento) {
		navegador.findElement(elemento).click();
	
	}
	public void pausar(int tempo) throws InterruptedException{
			Thread.sleep(tempo);
	}
	public void preencherCampo(By elemento , String texto) {
		navegador.findElement(elemento).sendKeys(texto);
	}
	
	public void fecharNavegador() {
		navegador.quit();
	}
	
	public void tirarPrint (String nome) throws IOException {
		
		TakesScreenshot scrShot = ((TakesScreenshot) navegador);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("./src/evidencias/" + nome + ".png");
		FileUtils.copyFile(SrcFile, DestFile);	
	}
	
	public void validarTexto(By elemento , String texto) {
		String mensagem = navegador.findElement(elemento).getText();
		assertEquals(texto, mensagem);	
	}
	
	public void scroll(By elemento) {
		WebElement element = navegador.findElement(elemento);
	((JavascriptExecutor)navegador).executeScript("arguments[0].scrollIntoView(true)", element);	
	}
	
}
