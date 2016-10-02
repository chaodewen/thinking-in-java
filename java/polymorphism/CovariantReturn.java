package polymorphism;

import static Cc.Print.*;

class Grain {
	public String toString() {
		return "Grain";
	}
}

class Wheat extends Grain {
	public String toString() {
		return "Wheat";
	}
}

class Mill {
	Grain process() {
		return new Grain();
	}
	public String toString() {
		return "Mill";
	}
}

class WheatMill extends Mill {
	Wheat process() {
		return new Wheat();
	}
	public String toString() {
		return "WheatMill";
	}
}

public class CovariantReturn {
	public static void main(String[] args) {
		Mill m = new Mill();
		Grain g = m.process();
		print(g);
		m = new WheatMill();
		print(m);
		g = m.process();
		print(g);
	}
}
