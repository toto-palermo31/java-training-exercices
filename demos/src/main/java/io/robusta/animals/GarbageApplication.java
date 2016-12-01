package io.robusta.animals;

public class GarbageApplication {

	public static void main(String[] args) {
		// start stack
		GarbageApplication app = new GarbageApplication();
		app.init();
	}

	// add stack
	void init() {
		Pingouin kowalsky = createUsefulPingouin();
		createGarbagePingouin();
	}

	Pingouin createUsefulPingouin() {
		Pingouin k = new Pingouin("Kowalsky");
		return k;
	}

	void createGarbagePingouin() {
		Pingouin soldat = new Pingouin("Soldat");
	}
}