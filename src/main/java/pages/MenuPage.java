package pages;

import core.BasePage;

public class MenuPage extends BasePage {
	
	public void acessarTelaAdicionarConta(){
		clicarLink("Contas");
		clicarLink("Adicionar");
	}

	public void acessarTelaListarConta() {
		clicarLink("Contas");
		clicarLink("Listar");
	}
	public void acessarTelaInserirMovimentacao() {
		clicarLink("Criar Movimentação");
		
	}
	
	public void accessarTelaResumoMensal() {
		clicarLink("Resumo Mensal");
	}
	public void accessarTelaHome() {
		clicarLink("Home");
	}
}
