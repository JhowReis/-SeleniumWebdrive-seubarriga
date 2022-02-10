package tests;

import org.junit.Assert;
import org.junit.Test;

import core.BaseTest;
import pages.HomePage;
import pages.MenuPage;

public class TesteSaldo extends BaseTest {
	
	HomePage homePage = new HomePage();
	MenuPage menuPage = new MenuPage();
	
	@Test
	public void saldoNaConta(){
		menuPage.accessarTelaHome();
		Assert.assertEquals("534.00", homePage.obterSaldoConta("Conta para saldo"));
		
	}
}
