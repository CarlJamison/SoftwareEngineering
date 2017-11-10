import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FractionTests {

	@Test
	public void testTestAddTest() {
		
		Fraction myFraction = new CandidateFraction(3, 1);
		Fraction myFraction2 = new CandidateFraction(1, 1);
		Fraction myFraction3 = myFraction.add(myFraction2);
		assertEquals(myFraction3.getNumerator(), 4);
		assertEquals(myFraction3.getDenominator(), 1);
	}
	
	@Test
	public void testAddTest() {
		
		Fraction myFraction = new CandidateFraction(5, 7);
		Fraction myFraction2 = new CandidateFraction(5, 3);
		Fraction myFraction3 = myFraction.add(myFraction2);
		assertEquals(myFraction3.getNumerator(), 50);
		assertEquals(myFraction3.getDenominator(), 21);
	}
	
	@Test
	public void testZeroFractionTest() {
	
		Fraction myFraction = new CandidateFraction(0, 1);
		Fraction myFraction2 = new CandidateFraction(1, 1);
		Fraction myFraction3 = myFraction.add(myFraction2);
		assertEquals(myFraction3.getNumerator(), 1);
		assertEquals(myFraction3.getDenominator(), 1);
	}
	
	
	@Test
	public void testReducedFraction() {
		
		Fraction myFraction = new CandidateFraction(4, 2);
		Fraction myFraction2 = new CandidateFraction(2, 2);
		Fraction myFraction3 = myFraction.add(myFraction2);
		assertEquals(myFraction3.getNumerator(), 3);
		assertEquals(myFraction3.getDenominator(), 1);
	}
	
	@Test
	public void testNegativeNumeratorFraction() {
		
		Fraction myFraction = new CandidateFraction(-5, 2);
		Fraction myFraction2 = new CandidateFraction(-2, 3);
		Fraction myFraction3 = myFraction.add(myFraction2);
		assertEquals(myFraction3.getNumerator(), -19);
		assertEquals(myFraction3.getDenominator(), 6);
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void testOverflowFractionTest() {
		thrown.expect(ArithmeticException.class);
		Fraction myFraction = new CandidateFraction(999999999, 276);
		Fraction myFraction2 = new CandidateFraction(444444444, 34);
		Fraction myFraction3 = myFraction.add(myFraction2);
	}

}
