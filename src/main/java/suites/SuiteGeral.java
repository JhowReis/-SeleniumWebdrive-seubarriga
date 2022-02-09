 package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

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
	
}
