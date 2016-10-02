package interfaces.music4;

import static Cc.Print.*;

enum Note {
	Middle_C, C_SHARP, B_FLAT
}

abstract class Instrument {
	//private int i; // Storage allocated for each
	public abstract void play(Note n);
	public String what() {
		return "Instrument";
	}
	public abstract void adjust();
}

class Wind extends Instrument {
	public void play(Note n) {
		print("Wind.play()" + n);
	}
	public String what() {
		return "Wind";
	}
	public void adjust() {}
}

class Percussion extends Instrument {
	public void play(Note n) {
		print("Percussion.play()" + n);
	}
	public String what() {
		return "Percussion";
	}
	public void adjust() {}
}

class Stringed extends Instrument {
	public void play(Note n) {
		print("Stringed.play()" + n);
	}
	public String what() {
		return "Stringed";
	}
	public void adjust() {}
}

class Brass extends Wind {
	public void play(Note n) {
		print("Brass.play()" + n);
	}
	public void adjust() {
		print("Brass.adjust()");
	}
}

class Woodwind extends Wind {
	public void play(Note n) {
		print("Woodwind.play()" + n);
	}
	public String what() {
		return "Woodwind";
	}
}

public class Music4 {
	// Doesn't care about the type, so new types
	// added to the system still work right:
	static void tune(Instrument i) {
		// ...
		i.play(Note.Middle_C);
	}
	static void tuneAll(Instrument[] e) {
		for(Instrument i : e) {
			tune(i);
		}
	}
	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Instrument[] orchestra = {
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new Woodwind()
		};
		tuneAll(orchestra);
	}
}