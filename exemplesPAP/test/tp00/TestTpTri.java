package tp00;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTpTri {

	@Test
	void testTriInsertion() {
		int[] v0 = { 1 };
		TpTri.triInsertion(v0);
		assertArrayEquals(v0, v0);

		int[] v1 = { 8, 7, 4, 1, 9, 2 };
		int[] v1R = { 1, 2, 4, 7, 8, 9 };
		TpTri.triInsertion(v1);
		assertArrayEquals(v1R, v1);

		int[] v2 = { 9, 4, 1 };
		int[] v2R = { 1, 4, 9 };
		TpTri.triInsertion(v2);
		assertArrayEquals(v2R, v2);
	}

}
