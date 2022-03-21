package tp00;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tp00.TpVect.TypeMinMax;

class TestVecteur {
	static int[] v1 = { 0, -2, -100, 0, 30, 6, 9, 20, 22 };
	static int[] v2 = { 0, 6, 22 };
	static int[] v3 = {};
	static int[] v4 = { 9 };

	@Test
	void testMaxElem() {
		assertEquals(30, TpVect.maxElem(v1));
		assertEquals(22, TpVect.maxElem(v2));
		assertEquals(9, TpVect.maxElem(v4));
		assertThrows(AssertionError.class, () -> TpVect.maxElem(v3));
	}

	@Test
	void testMaxMinElem() {
		assertEquals(30, TpVect.maxMinElem(v1, false));
		assertEquals(22, TpVect.maxMinElem(v2, false));
		assertEquals(9, TpVect.maxMinElem(v4, false));
		assertEquals(-100, TpVect.maxMinElem(v1, true));
		assertEquals(0, TpVect.maxMinElem(v2, true));
		assertEquals(9, TpVect.maxMinElem(v4, true));
		assertThrows(AssertionError.class, () -> TpVect.maxMinElem(v3, true));
	}
	@Test
	void testMaxMinElem2() {
		assertEquals(30, TpVect.maxMinElem(v1, TypeMinMax.MAX));
		assertEquals(22, TpVect.maxMinElem(v2, TypeMinMax.MAX));
		assertEquals(9, TpVect.maxMinElem(v4, TypeMinMax.MAX));
		assertEquals(-100, TpVect.maxMinElem(v1, TypeMinMax.MIN));
		assertEquals(0, TpVect.maxMinElem(v2, TypeMinMax.MIN));
		assertEquals(9, TpVect.maxMinElem(v4, TypeMinMax.MIN));
		assertThrows(AssertionError.class, () -> TpVect.maxMinElem(v3, TypeMinMax.MIN));
	}
}
