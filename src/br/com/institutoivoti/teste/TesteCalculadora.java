package br.com.institutoivoti.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.institutoivoti.lib.Calculadora;

public class TesteCalculadora {
	private Calculadora calculadora;

	@Before
	public void before() {
		calculadora = new Calculadora();
	}
	
	@Test
	public void somaNumerosInteiros() {
		calculadora.Somar(3);
		assertEquals(calculadora.getResultado(), 3, 0);
		calculadora.Somar(7);
		assertEquals(calculadora.getResultado(), 10, 0);
	}

	@Test
	public void somaNumerosComVirgula() {
		calculadora.Somar(2.33);
		assertEquals(calculadora.getResultado(), 2.33, 0); 
	}
	
	@Test
	public void criaCalculadoraComValorInicial() {
		calculadora = new Calculadora(10);
		assertEquals(calculadora.getResultado(), 10, 0);
		calculadora.Somar(3);
		assertEquals(calculadora.getResultado(), 13, 0); 
	}	
	
	@Test
	public void multiplicar() {
		calculadora = new Calculadora(10);
		assertEquals(calculadora.getResultado(), 10, 0);
		calculadora.Multiplicar(3);
		assertEquals(calculadora.getResultado(), 30, 0);
		
	}
	
}