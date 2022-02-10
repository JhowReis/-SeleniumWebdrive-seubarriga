 package suites;

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
	public static void reset() {
		page.logar("jonathan.linkedin2019@gmail.com", "jhowjhow2");
		page.resetar();
		
	}
	
	
}
