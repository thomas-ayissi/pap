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

	@Test
	void testMinMaxElem() {
		int[] resV1 = { -100, 30 };
		int[] resV2 = { 0, 22 };
		int[] resV4 = { 9, 9 };
		assertArrayEquals(resV1, TpVect.minMaxElem(v1));
		assertArrayEquals(resV2, TpVect.minMaxElem(v2));
		assertArrayEquals(resV4, TpVect.minMaxElem(v4));
		assertThrows(AssertionError.class, () -> TpVect.minMaxElem(v3));
	}

	@Test
	void testPalindrome() {
		char[] p0 = {};
		char[] p1 = { 'A' };
		char[] p2 = { 'A', 'A' };
		char[] p3 = { 'A', 'A', 'A' };
		char[] p4 = { 'A', 'B' };
		char[] p5 = { 'A', 'B', 'A' };
		char[] p6 = { 'R', 'A', 'D', 'A', 'R' };
		char[] p7 = { 'A', 'B', 'B', 'A' };
		char[] p8 = { 'A', 'B', 'C', 'D', 'B', 'A' };
		char[] p9 = { 'A', 'A', 'A', 'A', 'B' };
		assertTrue(TpVect.estPalindrome(p1));
		assertTrue(TpVect.estPalindrome(p2));
		assertTrue(TpVect.estPalindrome(p3));
		assertTrue(TpVect.estPalindrome(p5));
		assertTrue(TpVect.estPalindrome(p6));
		assertTrue(TpVect.estPalindrome(p7));
		assertFalse(TpVect.estPalindrome(p4));
		assertFalse(TpVect.estPalindrome(p8));
		assertFalse(TpVect.estPalindrome(p9));
		assertThrows(AssertionError.class, () -> TpVect.estPalindrome(p0));
	}

	@Test
	void testPalindrome2() {
		char[] p0 = {};
		char[] p1 = { 'A' };
		char[] p2 = { 'A', 'A' };
		char[] p3 = { 'A', 'A', 'A' };
		char[] p4 = { 'A', 'B' };
		char[] p5 = { 'A', 'B', 'A' };
		char[] p6 = { 'R', 'A', 'D', 'A', 'R' };
		char[] p7 = { 'A', 'B', 'B', 'A' };
		char[] p8 = { 'A', 'B', 'C', 'D', 'B', 'A' };
		char[] p9 = { 'A', 'A', 'A', 'A', 'B' };
		assertTrue(TpVect.estPalindrome2(p1));
		assertTrue(TpVect.estPalindrome2(p2));
		assertTrue(TpVect.estPalindrome2(p3));
		assertTrue(TpVect.estPalindrome2(p5));
		assertTrue(TpVect.estPalindrome2(p6));
		assertTrue(TpVect.estPalindrome2(p7));
		assertFalse(TpVect.estPalindrome2(p4));
		assertFalse(TpVect.estPalindrome2(p8));
		assertFalse(TpVect.estPalindrome2(p9));
		assertThrows(AssertionError.class, () -> TpVect.estPalindrome2(p0));
	}

	@Test
	void testCopyInverse() {
		char[] p0 = {};
		char[] p1 = { 'A' };
		char[] p2 = { 'A', 'B' };
		char[] p3 = { 'A', 'V', 'X' };
		char[] p2i = { 'B', 'A' };
		char[] p3i = { 'X', 'V', 'A' };

		assertArrayEquals(p1, TpVect.copyInverse(p1));
		assertArrayEquals(p2i, TpVect.copyInverse(p2));
		assertArrayEquals(p3i, TpVect.copyInverse(p3));
		assertArrayEquals(p0, TpVect.copyInverse(p0));
	}
}
