package br.edu.ifal.leilao.controle;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.edu.ifal.leilao.modelo.Cliente;
import br.edu.ifal.leilao.modelo.Lance;
import br.edu.ifal.leilao.modelo.Leilao;
import br.edu.ifal.leilao.modelo.Produto;


public class ControleLeilaoTest {

	private Produto produto;
	private double lanceMinimo;
	private Leilao leilao;
	private ControleLeilao controle;
	private Cliente cliente;

	@Before
	public void inicializacao(){
		produto = new Produto("TV");
		lanceMinimo = 1200;
		leilao = new Leilao(produto, lanceMinimo);
		controle = new ControleLeilao();
		cliente = new Cliente("Ana", "123");
	}

	@Test
	public void deveRetornarVerdadeiroParaUmLanceMaiorQueOValorMinimoDoProduto() {
		Lance novoLance = new Lance(cliente, 1201);
		boolean validadeRetornada = controle.validarLance(novoLance, leilao);
		boolean validadeEsperada = true;
		assertEquals(validadeEsperada, validadeRetornada);
		
	}

	@Test
	public void deveRetornarFalsoParaUmLanceMenorQueOValorMinimoDoProduto() {
		Lance novoLance = new Lance(cliente, 1000);
		boolean validadeRetornada = controle.validarLance(novoLance, leilao);
		boolean validadeEsperada = false;
		assertEquals(validadeEsperada, validadeRetornada);
	}

	@Test
	public void deveRetornarVerdadeiroParaUmLanceIgualQueOValorMinimoDoProduto() {
		Lance novoLance = new Lance(cliente, 1200);
		boolean validadeRetornada = controle.validarLance(novoLance, leilao);
		boolean validadeEsperada = true;
		assertEquals(validadeEsperada, validadeRetornada);
}
	@Test
	public void deveRetornaFalsoParaDoisLancesSeguidosDoMesmoCliente() {
		leilao.addLance(new Lance(cliente, 1300));
		Lance novoLance = new Lance(cliente, 1400);
		boolean validadeRetornada = controle.validarLance(novoLance, leilao);
		boolean validadeEsperada = false;
		assertEquals(validadeEsperada, validadeRetornada);
	}
}
