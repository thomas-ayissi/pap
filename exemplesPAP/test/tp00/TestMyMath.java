package tp00;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TestMyMath {
	@Test
	void testFactorielle() {
		assertEquals(120, MyMath.factorielle(5));
		assertEquals(1, MyMath.factorielle(0));
		assertEquals(1, MyMath.factorielle(1));
		assertEquals(2, MyMath.factorielle(2));
		assertThrows(AssertionError.class, () -> MyMath.factorielle(-1));
		assertThrows(AssertionError.class, () -> MyMath.factorielle(21));
	}

	@Test
	void testPower1() {
		assertEquals(1.0, MyMath.power(0.0, 0));
		assertEquals(1, MyMath.power(-1, 0));
		assertEquals(0, MyMath.power(0.0, 4));
		assertEquals(4, MyMath.power(4.0, 1));
		assertEquals(-8.0, MyMath.power(-2.0, 3));
		assertEquals(4.0, MyMath.power(-2.0, 2));
		assertEquals(125, MyMath.power(5.0, 3));
		assertEquals(2.5961484292674138E33, MyMath.power(2, 111));
		assertThrows(AssertionError.class, () -> MyMath.power(0, -1));
	}

	@Test
	void testPgcd() {
		assertEquals(3, MyMath.pgcd(15, 9));
		assertEquals(3, MyMath.pgcd(9, 15));
		assertEquals(10, MyMath.pgcd(10, 10));
		assertEquals(1, MyMath.pgcd(17, 31));
		assertThrows(AssertionError.class, () -> MyMath.pgcd(0, -1));
		assertThrows(AssertionError.class, () -> MyMath.pgcd(-4, 0));
	}

	@Test
	void testNbUn() {
		assertEquals(0, MyMath.nbUn(0));
		assertEquals(1, MyMath.nbUn(1));
		assertEquals(1, MyMath.nbUn(8));
		assertEquals(8, MyMath.nbUn(255));
		assertEquals(64, MyMath.nbUn(-1));
	}
	@Test
	void testPower2() {
		assertEquals(1.0, MyMath.power2(0.0, 0));
		assertEquals(1, MyMath.power2(-1, 0));
		assertEquals(0, MyMath.power2(0.0, 4));
		assertEquals(4, MyMath.power2(4.0, 1));
		assertEquals(-8.0, MyMath.power2(-2.0, 3));
		assertEquals(4.0, MyMath.power2(-2.0, 2));
		assertEquals(125, MyMath.power2(5.0, 3));
		assertEquals(2.5961484292674138E33, MyMath.power(2, 111));
		assertThrows(AssertionError.class, () -> MyMath.power(0, -1));
	}
	
	@Test
	void testUtf8() {
		assertEquals(1, MyMath.nbBytesUtf8('A'));
		assertEquals(2, MyMath.nbBytesUtf8('é'));
		assertEquals(3, MyMath.nbBytesUtf8('€'));
	}
	

}
