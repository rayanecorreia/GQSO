package controle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.ifal.leilao.Cliente;
import br.edu.ifal.leilao.Lance;
import br.edu.ifal.leilao.Leilao;
import br.edu.ifal.leilao.Produto;


public class ControleLeilaoTest {
	@Test
	public void deveRetornarVerdadeiroParaUmLanceMaiorQueOValorMinimoDoProduto() {
		Produto produto = new Produto("TV");
		double lanceMinimo = 1200;
		Leilao leilao = new Leilao(produto, lanceMinimo);
		ControleLeilao controle = new ControleLeilao();
		Cliente cliente = new Cliente("Zé");
		Lance novoLance = new Lance(cliente, 1201);
		boolean validadeRetornada = controle.validarLance(novoLance, leilao);
		boolean validadeEsperada = true;
		assertEquals(validadeEsperada, validadeRetornada);
		
	}
	@Test
	public void deveRetornarFalsoParaUmLanceMaiorQueOValorMinimoDoProduto() {
		Produto produto = new Produto("TV");
		double lanceMinimo = 1200;
		Leilao leilao = new Leilao(produto, lanceMinimo);
		ControleLeilao controle = new ControleLeilao();
		Cliente cliente = new Cliente("Zé");
		Lance novoLance = new Lance(cliente, 1000);
		boolean validadeRetornada = controle.validarLance(novoLance, leilao);
		boolean validadeEsperada = false;
		assertEquals(validadeEsperada, validadeRetornada);
	
}
	@Test
	public void deveRetornarVerdadeiroParaUmLanceIgualQueOValorMinimoDoProduto() {
		Produto produto = new Produto("TV");
		double lanceMinimo = 1200;
		Leilao leilao = new Leilao(produto, lanceMinimo);
		ControleLeilao controle = new ControleLeilao();
		Cliente cliente = new Cliente("Zé");
		Lance novoLance = new Lance(cliente, 1200);
		boolean validadeRetornada = controle.validarLance(novoLance, leilao);
		boolean validadeEsperada = true;
		assertEquals(validadeEsperada, validadeRetornada);
}
	@Test
	public void deveRetornaFalsoParaDoisLancesSeguidosDoMesmoCliente() {
		Produto produto = new Produto("TV");
		double lanceMinimo = 1200;
		Leilao leilao = new Leilao(produto, lanceMinimo);
		ControleLeilao controle = new ControleLeilao();
		Cliente cliente = new Cliente("Zé");
		leilao.addLance(new Lance(cliente, 1300));
		Lance novoLance = new Lance(cliente, 1400);
		boolean validadeRetornada = controle.validarLance(novoLance, leilao);
		boolean validadeEsperada = false;
		assertEquals(validadeEsperada, validadeRetornada);
		
		
	}
}
