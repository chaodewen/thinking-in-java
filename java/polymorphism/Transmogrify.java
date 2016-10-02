package polymorphism;

import static Cc.Print.*;

class Actor {
	void act() {}
}

class HappyActor extends Actor {
	public void act() {
		print("HappyActor");
	}
}

class SadActor extends Actor {
	public void act() {
		print("SadActor");
	}
}

class Stage {
	private Actor a = new HappyActor();
	public void change() {
		a = new SadActor();
	}
	public void performPlay() {
		a.act();
	}
}

public class Transmogrify {
	public static void main(String[] args) {
		Stage s = new Stage();
		s.performPlay();
		s.change();
		s.performPlay();
	}
}