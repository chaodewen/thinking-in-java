package polymorphism;

import static Cc.Print.*;

class Glyph {
	void draw() {
		print("Glyph.draw()");
	}
	Glyph() {
		print("Glyph() before draw()");
		draw();
		print("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;
	RoundGlyph(int r) {
		radius = r;
		print("RoundGlyph.draw(), radius = " + radius);
	}
	void draw() {
		print("RoundGlyph.draw(), radius = " + radius);
	}
}

public class PolyConstructors {
	public static void main(String[] args) {
		new RoundGlyph(5);//这里因为多态调用了子类的draw()
		new Glyph();
	}
}