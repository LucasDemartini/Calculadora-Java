package br.com.institutoivoti.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.institutoivoti.lib.Calculadora;

public class CalculadoraTeste {

	@Test
	public void somaNumerosInteriros(){
		Calculadora calculadora = new Calculadora();
		assertEquals(calculadora.Soma(2, 3), 5,0);
	}
	
	public void somaNumeroscomVirgula(){
		Calculadora calculadora = new Calculadora();
		assertEquals(calculadora.Soma(2.33, 3.22), 5.55, 0);
	}
}
