package innerclasses;

public class DotNew {
	public class Inner {
		Inner() {
			System.out.println("Inner()");
		}
	}
	public static void main(String[] args) {
		DotNew dn = new DotNew();
		DotNew.Inner dni = dn.new Inner();
		System.out.println(dni.getClass().toString());
	}
}
