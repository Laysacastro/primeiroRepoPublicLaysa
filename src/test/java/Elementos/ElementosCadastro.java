package Elementos;

import org.openqa.selenium.By;

public class ElementosCadastro {
	
	private By btnCriarNovaConta = By.xpath("/html/body/login-modal/div/div/div[3]/a[2]");
	private By cpUserNameCadastro = By.name("usernameRegisterPage");
	private By cpEmailCadastro = By.name("emailRegisterPage");
	private By cpSenhaCadastro = By.name("passwordRegisterPage");
	private By cpConfirmSenhaCadastro = By.name("confirm_passwordRegisterPage");	
	private By checkBoxAceitarPoliCadastro = By.xpath("//*[@id=\"formCover\"]/sec-view/div/input");
	private By btnRegistrar = By.id("register_btn");
	private By btnLogado = By.id("menuUserSVGPath");
	private By btnMinhaConta = By.xpath("//*[@id=\"loginMiniTitle\"]/label[1]");
	private By btnDeletarConta = By.cssSelector("#myAccountContainer > div:nth-child(6) > button > div");
	private By msgDeletarConta =By.xpath("//*[@id=\"deleteAccountPopup\"]/div[2]/p");
	private By btnSimDeletarConta = By.xpath("//*[@id=\"deleteAccountPopup\"]/div[3]/div[1]");
	public By getBtnCriarNovaConta() {
		return btnCriarNovaConta;
	}
	public By getCpUserNameCadastro() {
		return cpUserNameCadastro;
	}
	public By getCpEmailCadastro() {
		return cpEmailCadastro;
	}
	public By getCpSenhaCadastro() {
		return cpSenhaCadastro;
	}
	public By getCpConfirmSenhaCadastro() {
		return cpConfirmSenhaCadastro;
	}
	public By getCheckBoxAceitarPoliCadastro() {
		return checkBoxAceitarPoliCadastro;
	}
	public By getBtnRegistrar() {
		return btnRegistrar;
	}
	public By getBtnLogado() {
		return btnLogado;
	}
	public By getBtnMinhaConta() {
		return btnMinhaConta;
	}
	public By getBtnDeletarConta() {
		return btnDeletarConta;
	}
	public By getMsgDeletarConta() {
		return msgDeletarConta;
	}
	public By getBtnSimDeletarConta() {
		return btnSimDeletarConta;
	}
	
}
