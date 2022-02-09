 package suites;

import static core.DriverFactory.killDriver;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import pages.LoginPage;
import tests.ContaTeste;
import tests.MovimentacaoTeste;
import tests.RemoverMovimentacaoContaTeste;
import tests.ResumoTeste;
import tests.TesteSaldo;

@RunWith(Suite.class)
@SuiteClasses({
	ContaTeste.class,
	MovimentacaoTeste.class,
	RemoverMovimentacaoContaTeste.class,
	TesteSaldo.class,
	ResumoTeste.class
})
public class SuiteGeral {
	
	private static LoginPage page = new LoginPage();
	
	@BeforeClass
	public static void inicializa() {
		page.logar("jonathan.linkedin2019@gmail.com", "jhowjhow2");
		 
	}
	
	@AfterClass
	public static void finalizaTudo() {
		killDriver();
	}
}
