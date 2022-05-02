package exemplesNote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsExemples {

	public static void main(String[] args) {
		/**********************************
		 * Listes
		 ***********************************/
		// Liste non modifiable
		List<Integer> v1 = List.of(1, 2, 5);
		System.out.println(v1);
		// Liste modifiable mais de taille fixe
		List<Integer> v2 = Arrays.asList(1, 2, 5, 6);
		v2.set(0, 10);
		System.out.println(v2);

		// Liste vide extensible
		List<Integer> v3 = new ArrayList<>();
		v3.addAll(Arrays.asList(21, 33, 2, 9));
		System.out.println(v3);

		List<Integer> v = new ArrayList<>();
		v.addAll(Arrays.asList(10, 4, -3, 9));
		
		//Test de différentes méthodes pour les notes
		v.add(1, 99);
		v.addAll(1, Arrays.asList(1, 2, 3));
		v.remove(2);

		v.remove((Integer) (-3));
		
		System.out.println(v.contains(9));
		
		System.out.println(v.get(0));
		
	    v.set(0, 55);
		v.removeIf(x -> x<5);
		
		//Tri avec un compateur celui de Integer
		v.sort(Integer::compare);
		//Tri avec le comparateur par défaut de Integer
		Collections.sort(v);
		System.out.println(v);
		
		//Création d'une sous-liste
		v2 = v.subList(1, 3);
		System.out.println(v2);

		// Parcourir une liste version classique
		for (int i = 0; i < v.size(); i++)
			System.out.print(v.get(i) + " , ");
		System.out.println();
		// Parcourir avec une boucle "For each"
		for (Integer elem : v)
			System.out.print(elem + " , ");
		System.out.println();

		// Avec un itérateur
		var iter = v.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " , ");
		}
		System.out.println();

		/**********************************
		 * ENSEMBLES
		 ***********************************/
		// Ensemble non modifiable
		Set<Integer> ens1 = Set.of(1, 2, 3, 5, 8, 13);
		Set<Integer> ens2 = Set.of(1, 2, 4, 8, 16, 32);
		// ens modifiable non initialisé
		Set<Integer> e0 = new HashSet<>();
		// ens modifiable initialisé
		Set<Integer> e1 = new HashSet<>(ens1);
		Set<Integer> e2 = new HashSet<>(Arrays.asList(3, 6, 9, 12, 15));

		System.out.println(e0 + " " + e1 + " " + e2);
		System.out.println(e1.size());
		// Appartenance
		System.out.println(e2.contains(16));
		// Intersection
		e1.retainAll(ens2);
		System.out.println(e1);
		// exclusion
		e1.removeAll(ens2);
		System.out.println(e1);
		// Ajout d'un élément null
		e1.add(null);

		// Parcourir avec ForEach
		for (Integer e : e2) {
			System.out.print(e + ",");
		}
		System.out.println();

		// Parcourir avec ForEach Lambda
		e2.forEach(e -> System.out.print(e + ","));
		System.out.println();

		// Parcourir avec un itérateur
		var iter1 = e2.iterator();
		while (iter1.hasNext()) {
			System.out.print(iter1.next() + ",");
		}
		System.out.println();

		/**********************************
		 * Dictionnaire
		 ***********************************/
		// Map non modifiable v1
		Map<Integer, String> codesHttp1 = Map.of(200, "Succès", 301, "Indirection", 404, "Ressource non trouvée");
		// Map non modifiable v2
		Map<Integer, String> codesHttp2 = Map.ofEntries(Map.entry(200, "Succès"), Map.entry(301, "Indirection"),
				Map.entry(404, "Ressource non trouvée"));

		// Map modifiable
		Map<Integer, String> codesHttp3 = new HashMap<>();
		codesHttp3.put(200, "Succès");
		codesHttp3.put(301, "Indirection");
		codesHttp3.put(404, "Ressource non trouvée");

		// Ensemble des clés
		System.out.println(codesHttp3.keySet());
		// Ensemble des entrées
		System.out.println(codesHttp3.entrySet());
		// Collection des valeurs
		System.out.println(codesHttp3.values());
	}
}
