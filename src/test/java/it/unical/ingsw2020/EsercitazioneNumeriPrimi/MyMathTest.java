package it.unical.ingsw2020.EsercitazioneNumeriPrimi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {
	
	private static MyMath mm;
	
	@BeforeClass
	public static void prepare() {
		mm = new MyMath();
	}
	
	@Test
	public void primeNumbersGeneretorWorks() {
		assertEquals(new LinkedList<Integer>(), mm.primeNumbersGeneretor(1));
		assertEquals(Arrays.asList(2,3,5,7,11,13,17,19), mm.primeNumbersGeneretor(20));
	}
	
	@Test
	public void isPrimeWorks() {
		assertFalse(mm.isPrime(9));
		assertFalse(mm.isPrime(1));
		assertTrue(mm.isPrime(2));
		assertTrue(mm.isPrime(17));
	}
	
}
