package tp00;

import java.util.List;

public class TpRecherche {
	/**
	 * Recherche Binaire Type int
	 * 
	 * @param v   vecteur trié (entiers) par ordre croissant
	 * @param nbr le nombre à rechercher
	 * @return -1 (pas trouvé) sinon l'indice 0..length-1 de la position
	 */
	public static int rechercheBinV1(int[] v, int nbr) {
		if (v.length == 0)
			return -1;
		int a = 0;
		int b = v.length - 1;
		int m = b / 2;
		while (a < b && v[m] != nbr) {
			if (nbr < v[m])
				b = m - 1;
			else
				a = m + 1;
			m = (a + b) / 2;
		}
		if (v[m] == nbr)
			return m;
		else
			return -1;
	}

	/**
	 * Recherche Binaire Type Integer
	 * 
	 * @param v   vecteur trié (entiers) par ordre croissant
	 * @param nbr le nombre à rechercher
	 * @return -1 (pas trouvé) sinon l'indice 0..length-1 de la position
	 */
	public static int rechercheBinV2(List<Integer> v, Integer nbr) {
		if (v.size() == 0)
			return -1;
		int a = 0;
		int b = v.size() - 1;
		int m = b / 2;
		while (a < b && !v.get(m).equals(nbr)) {
			if (nbr < v.get(m))
				b = m - 1;
			else
				a = m + 1;
			m = (a + b) / 2;
		}
		if (v.get(m).equals(nbr))
			return m;
		else
			return -1;
	}

	public static void main(String[] args) {
		int[] v1 = { 1, 6, 8, 19, 25 };
		System.out.println(rechercheBinV1(v1, 1));
	}

}
