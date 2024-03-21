package Elementos;

import org.openqa.selenium.By;


public class ElementosTelaLogin {

	private By btnLogar = By.id("menuUser");
	private By cpUsername = By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[1]/div/input");
	private By cpSenha = By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/input");
	private By Btnlogin = By.id("sign_in_btn");

	public By getBtnLogar() {
		return btnLogar;
	}
	public By getCpUsername() {
		return cpUsername;
	}
	public By getCpSenha() {
		return cpSenha;
	}
	public By getBtnlogin() {
		return Btnlogin;
	}
	
	
		
	}
	

