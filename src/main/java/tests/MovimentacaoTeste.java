package tests;

import static utils.DataUtils.dataFormatada;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import core.BaseTest;
import pages.MenuPage;
import pages.MovimentacaoPage;
import utils.DataUtils;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MovimentacaoTeste extends BaseTest {
	
	private MenuPage menuPage = new MenuPage();
	private MovimentacaoPage movimentacaoPage = new MovimentacaoPage();
	
	@Test
	public void teste1_inserirMovimentacao() {
		menuPage.acessarTelaInserirMovimentacao();
		
		movimentacaoPage.setDataMovimentacao(dataFormatada(new Date()));		
		movimentacaoPage.setDataPagamento(dataFormatada(new Date()));
		movimentacaoPage.setDescricao("Movimentação bancária");
		movimentacaoPage.setInteressado("Sim");
		movimentacaoPage.setValor("900");
		movimentacaoPage.setConta("Conta para movimentacoes");
		movimentacaoPage.setStatusPago();
		movimentacaoPage.salvar();
		
		Assert.assertEquals("Movimentação adicionada com sucesso!", movimentacaoPage.obterMensagemSucesso());

		
		
	}
	@Test
	public void teste2_camposObrigatorios() {
		menuPage.acessarTelaInserirMovimentacao();

		movimentacaoPage.salvar();
		
		List<String> erros = movimentacaoPage.obterErros();
//		Assert.assertEquals("Data da Movimentação é obrigatório", erros.get(0));
//		Assert.asssertTrue(erros.contains("Data da Movimentação é obrigatório"));
		Assert.assertTrue(erros.containsAll(Arrays.asList(
				"Data da Movimentação é obrigatório",
				"Data do pagamento é obrigatório",
				"Descrição é obrigatório",
				"Interessado é obrigatório",
				"Valor é obrigatório",
				"Valor deve ser um número"
				)));
		Assert.assertEquals(6, erros.size());
	}
	@Test
	public void teste3_inserirMovimentacaoFutura() {
		menuPage.acessarTelaInserirMovimentacao();
		
		Date dataFutura = DataUtils.obterDataComDiferençaDias(5);
		
		
		movimentacaoPage.setDataMovimentacao(dataFormatada(dataFutura));		
		movimentacaoPage.setDataPagamento(DataUtils.dataFormatada(dataFutura));
		movimentacaoPage.setDescricao("Movimentação bancária");
		movimentacaoPage.setInteressado("Sim");
		movimentacaoPage.setValor("900");
		movimentacaoPage.setConta("Conta para movimentacoes");
		movimentacaoPage.setStatusPago();
		movimentacaoPage.salvar();
		
		
		List<String> erros = movimentacaoPage.obterErros();
		Assert.assertTrue(erros.contains("Data da Movimentação deve ser menor ou igual à data atual"));
		Assert.assertEquals(1, erros.size());
		
		
	}

}
