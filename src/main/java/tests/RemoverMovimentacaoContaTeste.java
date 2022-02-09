package tests;

import org.junit.Assert;
import org.junit.Test;

import core.BaseTest;
import core.Propriedades;
import pages.ContasPage;
import pages.MenuPage;

public class RemoverMovimentacaoContaTeste extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();
	
	@Test
	public void excluirContaComMovimentacao() {
		menuPage.acessarTelaListarConta();
		
		contasPage.clicarExcluirConta(Propriedades.NOME_CONTA_ALTERADA);
		
		Assert.assertEquals("Conta em uso na movimentações", contasPage.obterMensagemErro());
	}

}
