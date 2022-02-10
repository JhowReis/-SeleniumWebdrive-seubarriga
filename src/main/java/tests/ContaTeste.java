package tests;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import core.BaseTest;
import pages.ContasPage;
import pages.MenuPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ContaTeste extends BaseTest {

	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();

	@Test
	public void teste1_InserirConta() {
		menuPage.acessarTelaAdicionarConta();

		contasPage.setNome("Conta do Teste");
		contasPage.salvar();

		Assert.assertEquals("Conta adicionada com sucesso!", contasPage.obterMensagemSucesso());
	}

	@Test
	public void teste2_alterarConta() {
		menuPage.acessarTelaListarConta();

		contasPage.clicarAlterarConta("Conta para alterar");
		contasPage.setNome("Conta Alterada");
		contasPage.salvar();

		Assert.assertEquals("Conta alterada com sucesso!", contasPage.obterMensagemSucesso());

	}

	@Test
	public void teste3_inserirContaMesmoNome() {
		menuPage.acessarTelaAdicionarConta();

		contasPage.setNome("Conta mesmo nome");
		contasPage.salvar();

		Assert.assertEquals("Já existe uma conta com esse nome!", contasPage.obterMensagemErro());

	}
	


}
