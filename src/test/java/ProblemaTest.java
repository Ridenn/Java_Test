

import org.junit.Test;

import br.com.javatest.Problema;
import junit.framework.*; 

public class ProblemaTest extends TestCase{
 
	@Test
	public void testchamaAcao(){
		String comando = "LMRDDMMUU";
		String retornoEsperado = "-1 2 0 NORTE";
		
		String retornoFeito = Problema.chamaAcao(comando);
		
		assertEquals(retornoEsperado, retornoFeito);
	}
}