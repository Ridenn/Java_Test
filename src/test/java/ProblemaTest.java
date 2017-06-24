

import org.junit.Test;

import br.com.javatest.Problema;
import junit.framework.*; 

public class ProblemaTest extends TestCase{
 
	@Test
	public void testchamaAcao(){
		String comando = "LMMMRMRRMMDDDU";//teste1: LMRDDMMUU / teste2: RMMLMMMDDLL / teste3: LMMMRMRRMMDDDU
		String retornoEsperado = "-3 -1 -2 SUL";//retorno1: -1 2 0 NORTE / retorno2: 2 3 -2 SUL / retorno3: -3 -1 -2 SUL
		
		String retornoFeito = Problema.chamaAcao(comando);
		
		assertEquals(retornoEsperado, retornoFeito);
	}
}