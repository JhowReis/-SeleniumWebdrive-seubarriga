package pages;

import static core.DriverFactory.getDriver;

import core.BasePage;

public class LoginPage extends BasePage {
	
	public void acessarTelaInicial() {
		getDriver().get("https://seubarriga.wcaquino.me/login");
	}
	
	public void setEmail(String email) {
		escrever("email", email);
	}
	public void setSenha(String senha) {
		escrever("senha", senha);
	}
	
	public void entrar() {
		clicarBotaoPorTexto("Entrar");
	}
	public void logar(String email, String senha) {
		acessarTelaInicial();
		setEmail(email);
		setSenha(senha);
		entrar();
	}
	public void resetar() {
		clicarLink("reset");
	}
}
