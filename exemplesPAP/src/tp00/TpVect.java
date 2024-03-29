package tp00;

public class TpVect {
	// classe �num�r�e pour pr�ciser un param�tre d'une fonction
	public enum TypeMinMax {
		MIN, MAX
	};

	/**
	 * Affiche un vecteur simplement 1 2 3
	 * 
	 * @param v
	 */
	public static void afficheVecteurV0(int[] v) {
		for (int elem : v)
			System.out.print(elem + " ");

		System.out.println();
	}

	/**
	 * Affiche un vecteur [1 , 2 , 3]
	 * 
	 * @param v
	 */
	public static void afficheVecteur(int[] v) {
		System.out.print('[');
		for (int i = 0; i < v.length - 1; i++)
			System.out.print(v[i] + " , ");

		if (v.length > 0)
			System.out.println(v[v.length - 1] + "]");
		else
			System.out.println("]");
	}

	/**
	 * Retourne l'�l�ment le plus grand du vecteur
	 * 
	 * @param v le vecteur
	 * @return le maximum
	 */
	public static int maxElem(int[] v) {
		assert v.length > 0 : "Le vecteur doit avoir minimim 1 �l�ment";
		int maxi = v[0];
		for (int i = 1; i < v.length; i++)
			if (maxi < v[i])
				maxi = v[i];
		return maxi;
	}

	/**
	 * Retourne le minimum ou le maximum du vecteur
	 * 
	 * @param v   le vecteur
	 * @param min true ==> minimum false ==> maximum
	 * @return le min ou le max du vecteur
	 */
	public static int maxMinElem(int[] v, boolean min) {
		assert v.length > 0 : "Le vecteur doit avoir minimim 1 �l�ment";
		int res = v[0];
		for (int i = 1; i < v.length; i++)
			if (!min && res < v[i] || min && res > v[i])
				res = v[i];

		return res;
	}

	/**
	 * Retourne le minimum ou le maximum du vecteur
	 * 
	 * @param v   le vecteur
	 * @param min true ==> minimum false ==> maximum
	 * @return le min ou le max du vecteur
	 */
	public static int maxMinElem(int[] v, TypeMinMax type) {
		return maxMinElem(v, type == TypeMinMax.MIN);
	}

	/**
	 * Retourne les valeurs minimum et maximum du vecteur
	 * 
	 * @param v
	 * @return res[0] <- Minimum et res[1] <- Maximum
	 */
	public static int[] minMaxElem(int[] v) {
		assert v.length > 0 : "Le vecteur doit avoir minimim 1 �l�ment";
		// res[0] ==> minimum ; res[1]==> maximum
		int[] res = { v[0], v[0] };
		for (int i = 1; i < v.length; i++)
			if (res[0] > v[i])// a-t-on un �l�ment plus petit que mini
				res[0] = v[i];
			else if (res[1] < v[i])// a-t-on un �l�ment plus grand que maxi
				res[1] = v[i];
		return res;
	}

	/**
	 * V�rifie si un texte est un palindrome
	 * 
	 * @param v
	 * @return true si c'est un palindrome
	 */
	public static boolean estPalindrome(char[] v) {
		assert v.length > 0 : "Le vecteur doit avoir minimim 1 �l�ment";
		int i = 0;
		int j = v.length - 1;
		while (i < j && v[i] == v[j]) {
			i++;
			j--;
		}
		return i >= j;
	}

	/**
	 * retourne un copie inverse du vecteur v ne modifie pas le vecteur v
	 * 
	 * @param v le vecteur
	 * @return une copie du vecteur invers�e
	 */
	public static char[] copyInverse(char[] v) {
		char[] res = new char[v.length];
		int j = v.length - 1;
		for (char elem : v) {
			res[j] = elem;
			j--;
		}
		return res;
	}

	/**
	 * V�rifie si un texte est un palindrome
	 * 
	 * @param v
	 * @return true si c'est un palindrome
	 */
	public static boolean estPalindrome2(char[] v) {
		assert v.length > 0 : "Le vecteur doit avoir minimim 1 �l�ment";
		// Cr�e une copie invers�e du vecteur V
		char[] w = copyInverse(v);
		int i = 0;
		while (i < v.length - 1 && v[i] == w[i])
			i++;
		return v[i] == w[i];
	}

	public static void main(String[] args) {
		int[] v = { 1, 2, 3, 5, 8, 13 };

		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
		System.out.println();
		System.out.println("Le vecteur v poss�de " + v.length + " �l�ments");
		System.out.println("Vecteur V: " + v);
		int[] w = v;
		System.out.println("Vecteur W: " + w);
		int[] v1 = { 0, 1, 1, 2, 3, 5, 8, 13, 21 };
		afficheVecteur(v1);
		System.out.println("Valeur Maximum: " + maxElem(v1));
		System.out.println("FIN");
		int[] v2 = {};
		afficheVecteur(v2);
		int[] v3 = { 9 };
		afficheVecteur(v3);

		int[] res = minMaxElem(v);
		afficheVecteur(res);
		System.out.println("====================");
		char[] txt = { 'A', 'B' };
		char[] inv = copyInverse(txt);
		for (char c : inv)
			System.out.print(c);

	}

}
