package tp00;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class TestTpRecherche {
	static int[] v1 = { 3, 5, 8, 20, 30 };
	static int[] v2 = { 3, 5, 8, 20, 30, 60 };
	static int[] v3 = { 3 };
	static int[] v4 = { 1, 5 };
	static int[] v5 = {};
	static List<Integer> l1 = List.of(3, 5, 8, 20, 30);
	static List<Integer> l2 = List.of(30, 50, 80, 200, 300, 600);
	static List<Integer> l3 = List.of(3);
	static List<Integer> l4 = List.of(1, 5);
	static List<Integer> l5 = List.of();

	@Test
	void testRechercheBinV1() {
		assertEquals(0, TpRecherche.rechercheBinV1(v1, 3));
		assertEquals(4, TpRecherche.rechercheBinV1(v1, 30));
		assertEquals(1, TpRecherche.rechercheBinV1(v1, 5));
		assertEquals(-1, TpRecherche.rechercheBinV1(v1, 1));
		assertEquals(-1, TpRecherche.rechercheBinV1(v1, 33));
		assertEquals(-1, TpRecherche.rechercheBinV1(v1, 7));

		assertEquals(0, TpRecherche.rechercheBinV1(v2, 3));
		assertEquals(4, TpRecherche.rechercheBinV1(v2, 30));
		assertEquals(1, TpRecherche.rechercheBinV1(v2, 5));
		assertEquals(-1, TpRecherche.rechercheBinV1(v2, 1));
		assertEquals(-1, TpRecherche.rechercheBinV1(v2, 63));
		assertEquals(-1, TpRecherche.rechercheBinV1(v2, 7));

		assertEquals(-1, TpRecherche.rechercheBinV1(v3, -6));
		assertEquals(-1, TpRecherche.rechercheBinV1(v3, 7));
		assertEquals(0, TpRecherche.rechercheBinV1(v3, 3));

		assertEquals(-1, TpRecherche.rechercheBinV1(v4, 2));
		assertEquals(-1, TpRecherche.rechercheBinV1(v4, -1));
		assertEquals(0, TpRecherche.rechercheBinV1(v4, 1));

		assertEquals(-1, TpRecherche.rechercheBinV1(v5, -6));

	}

	@Test
	void testRechercheBinV2() {
		assertEquals(0, TpRecherche.rechercheBinV2(l1, 3));
		assertEquals(4, TpRecherche.rechercheBinV2(l1, 30));
		assertEquals(1, TpRecherche.rechercheBinV2(l1, 5));
		assertEquals(-1, TpRecherche.rechercheBinV2(l1, 1));
		assertEquals(-1, TpRecherche.rechercheBinV2(l1, 33));
		assertEquals(-1, TpRecherche.rechercheBinV2(l1, 7));

		assertEquals(0, TpRecherche.rechercheBinV2(l2, 30));
		assertEquals(4, TpRecherche.rechercheBinV2(l2, 300));
		assertEquals(1, TpRecherche.rechercheBinV2(l2, 50));
		assertEquals(-1, TpRecherche.rechercheBinV2(l2, 10));
		assertEquals(-1, TpRecherche.rechercheBinV2(l2, 630));
		assertEquals(-1, TpRecherche.rechercheBinV2(l2, 70));
		
		assertEquals(-1, TpRecherche.rechercheBinV2(l3, -6));
		assertEquals(-1, TpRecherche.rechercheBinV2(l3, 7));
		assertEquals(0, TpRecherche.rechercheBinV2(l3, 3));

		assertEquals(-1, TpRecherche.rechercheBinV2(l4, 2));
		assertEquals(-1, TpRecherche.rechercheBinV2(l4, -1));
		assertEquals(0, TpRecherche.rechercheBinV2(l4, 1));

		assertEquals(-1, TpRecherche.rechercheBinV2(l5, -6));

	}
}
