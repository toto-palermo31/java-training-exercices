package io.robusta.animals;

import java.security.AllPermission;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class IterationApplication {

	Pingouin kowalsky = new Pingouin("Kowalsky");
	Pingouin ricoh = new Pingouin("Ricoh");
	Pingouin soldat = new Pingouin("Soldat");
	Pingouin commandant = new Pingouin("Commandant");

	public static void main(String[] args) {
		IterationApplication app = new IterationApplication();
		app.iterateList();
		app.iterateSet();
		app.iterateMap();
	}

	void iterateList() {

		ArrayList<Pingouin> list = new ArrayList<>();
		Collections.addAll(list, kowalsky, ricoh, soldat, commandant);

		for (int i = 0; i < list.size(); i++) {

			char premierCaractere = list.get(i).name.charAt(0);
			System.out.println(premierCaractere);
			int dernierIndex = (list.get(i).name.length()) - 1;
			System.out.println(list.get(i).name.charAt(dernierIndex));
		}

	}

	void iterateSet() {
		HashSet<Pingouin> set = new HashSet<>();
		Collections.addAll(set, kowalsky, ricoh, soldat, commandant);

		// if size of name >6: display only 6 chars
		for (Pingouin current : set) {
			String name = current.name;
			if (current.name.length() > 6) {

				String machaine = name.substring(name.length() - 6);
				System.out.println(machaine);
			} else {
				System.out.println(name);
			}

		}

	}

	void iterateMap() {

		HashMap<Pingouin, Integer> map = new HashMap<>();
		map.put(commandant, 38);
		map.put(kowalsky, 30);
		map.put(ricoh, 12);
		map.put(soldat, 22);

		for (Entry<Pingouin, Integer> currrentEntry : map.entrySet()) {
			String display = currrentEntry.getKey() + " has " + currrentEntry.getValue() + " points.";
			System.out.println(display);
		}

	}
}
