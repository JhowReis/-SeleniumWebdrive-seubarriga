package tests;

import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.BaseTest;
import core.DriverFactory;
import pages.MenuPage;
import pages.ResumoPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResumoTeste extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	ResumoPage resumoPage = new ResumoPage();

	
	@Test
	public void teste_1removerMovimentacao() {
		menuPage.accessarTelaResumoMensal();
		
		resumoPage.removerMovimentacao();
		
		Assert.assertEquals("Movimentação removida com sucesso!", resumoPage.obterMensagemSucesso());
		
	}
	@Test
	public void teste_2resumoMensal() {
		menuPage.accessarTelaResumoMensal();
		Assert.assertEquals("Seu Barriga - Extrato", DriverFactory.getDriver().getTitle());
		
		resumoPage.selecionarAno("2016");
		resumoPage.buscar();
		
		
		
		
		List<WebElement> elementosEncontrados = 
				DriverFactory.getDriver().findElements(By.xpath("//*[@id='tabelaExtrato']/tbody/tr"));
		Assert.assertEquals(0, elementosEncontrados.size());
//		try {
//			DriverFactory.getDriver().findElement(By.xpath("//*[@id=tabelaExtrato']/tbody/tr"));
//			Assert.fail();
//		}catch (NoSuchElementException e) {
//			
//		}
		
	}
}
