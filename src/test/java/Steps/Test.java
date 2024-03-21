package Steps;

import java.io.IOException;

import Elementos.ElementosCadastro;
import Elementos.ElementosTelaLogin;
import Metodos.MetodosLoginPage;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;


public class Test {
	
	ElementosTelaLogin e = new ElementosTelaLogin();
	MetodosLoginPage m = new MetodosLoginPage();
	ElementosCadastro c = new ElementosCadastro();
	
	@Dado("que esteja no site {string}")
	public void que_esteja_no_site(String string) throws InterruptedException {
		m.abrirNavegador(string);
	   
	  
	}

	@Quando("eu clicar no icone de logar")
	public void eu_clicar_no_icone_de_logar() throws InterruptedException {
		m.pausar(4000);
		m.clicar(e.getBtnLogar());
	   
	}

	@Quando("preeencher usuario e senha validos")
	public void preeencher_usuario_e_senha_validos() throws InterruptedException {
		m.pausar(3000);
		m.preencherCampo(e.getCpUsername(), "Turma1234");
		m.pausar(3000);
		m.preencherCampo(e.getCpSenha(), "Turma123456");
	}

	@Quando("clicar no botao logar")
	public void clicar_nobotao_logar() {
	   m.clicar(e.getBtnlogin());
	}
	@Entao("devo logar com sucesso")
	public void sera_direcionado_ao_campo_de_login() throws InterruptedException {
	  m.pausar(3000);
	  m.fecharNavegador();
	}
//////////////////////////CADASTRO E EXCLUSAO DE CONTA////////////////////////////////////////////////
	

	@Quando("clica para criar nova conta")
	public void clica_para_criar_nova_conta() throws InterruptedException {
		m.pausar(4000);
		m.clicar(c.getBtnCriarNovaConta());
	   
	}

	@Quando("preencer dados obrigatorios")
	public void preencer_dados_obrigatorios() throws InterruptedException {
	  m.pausar(3000);
	  m.preencherCampo(c.getCpUserNameCadastro(), "dayanacast");
	  m.preencherCampo(c.getCpEmailCadastro(), "dayanacast@gmail.com");
	  m.preencherCampo(c.getCpSenhaCadastro(), "Mal@123456");
	  m.preencherCampo(c.getCpConfirmSenhaCadastro(), "Mal@123456");
	  m.pausar(3000);
	}

	@Quando("clichar no check box de politicas")
	public void clichar_no_check_box_de_politicas() throws InterruptedException {
	  m.clicar(c.getCheckBoxAceitarPoliCadastro());
	  m.pausar(4000);
	
	}

	@Quando("criar conta")
	public void criar_conta() throws InterruptedException {
	  m.clicar(c.getBtnRegistrar());
	  
	}

	@Quando("clicar para acessar minha conta")
	public void clicar_para_acessar_minha_conta() throws InterruptedException {
	   m.pausar(4000);
	   m.clicar(c.getBtnLogado());
	   m.pausar(4000);
	   m.clicar(c.getBtnMinhaConta());
	}

	@Quando("clicar para deletar a conta")
	public void clicar_para_deletar_a_conta() throws InterruptedException {
	   m.pausar(4000);
	   m.clicar(c.getBtnDeletarConta());
	   m.pausar(4000);
	   m.validarTexto(c.getMsgDeletarConta(), "Are sure you want to delete account?");
	   
	}

	@Entao("a conta sera deletada com sucesso")
	public void aconta_sera_deletada_com_sucesso() throws InterruptedException, IOException {
	   m.pausar(3000);
	   m.clicar(c.getBtnSimDeletarConta());
	   m.tirarPrint("Final");
	   m.fecharNavegador();
	}
	
/////////////CENARIO SCROLL NOTBOOK///////////////////////////////////////////////////////////////	
	@Quando("clicar no produto notbook")
	public void clicar_no_produto_notbook() {
	  
	}

	@Entao("deve levar a tela de compra do notbook")
	public void deve_levar_a_tela_de_compra_do_notbook() {
	   
	}
}


