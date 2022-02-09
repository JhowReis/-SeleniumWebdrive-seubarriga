package tests;

import org.junit.Assert;
import org.junit.Test;

import core.BaseTest;
import core.Propriedades;
import pages.HomePage;
import pages.MenuPage;

public class TesteSaldo extends BaseTest {
	
	HomePage homePage = new HomePage();
	MenuPage menuPage = new MenuPage();
	
	@Test
	public void saldoNaConta(){
		menuPage.accessarTelaHome();
		Assert.assertEquals("900.00", homePage.obterSaldoConta(Propriedades.NOME_CONTA_ALTERADA));
		
	}
}
