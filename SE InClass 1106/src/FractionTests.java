

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FractionTests {

	@Test
	void testTestAddTest() {
		
		Fraction myFraction = new CandidateFraction(3, 1);
		Fraction myFraction2 = new CandidateFraction(1, 1);
		Fraction myFraction3 = myFraction.add(myFraction2);
		assertEquals(myFraction3.getNumerator(), 4);
		assertEquals(myFraction3.getDenominator(), 1);
	}
	
	@Test
	void testAddTest() {
		
		Fraction myFraction = new CandidateFraction(3, 1);
		Fraction myFraction2 = new CandidateFraction(1, 1);
		Fraction myFraction3 = myFraction.add(myFraction2);
		assertEquals(myFraction3.getNumerator(), 4);
		assertEquals(myFraction3.getDenominator(), 1);
	}
	
	@Test
	void testZeroFractionTest() {
	
		Fraction myFraction = new CandidateFraction(0, 1);
		Fraction myFraction2 = new CandidateFraction(1, 1);
		Fraction myFraction3 = myFraction.add(myFraction2);
		assertEquals(myFraction3.getNumerator(), 1);
	}
	
	@Test
	void testReducedFraction() {
		
		Fraction myFraction = new CandidateFraction(4, 2);
		Fraction myFraction2 = new CandidateFraction(2, 2);
		Fraction myFraction3 = myFraction.add(myFraction2);
		assertEquals(myFraction3.getNumerator(), 3);
		assertEquals(myFraction3.getDenominator(), 1);
	}
	
	@Test
	void testNegativeFraction() {
		
		Fraction myFraction = new CandidateFraction(-1, 1);
		Fraction myFraction2 = new CandidateFraction(2, 1);
		Fraction myFraction3 = myFraction.add(myFraction2);
		assertEquals(myFraction3.getNumerator(), 1);
		assertEquals(myFraction3.getDenominator(), 1);
	}

}
