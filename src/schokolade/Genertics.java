package schokolade;

public class Genertics<X> {

	private X content;

	<T, V> Genertics(T t, V v) {
		System.out.println("Der Type T ist: " + t.getClass().getName());
		System.out.println("Der Type V ist: " + v.getClass().getName());
	}

	public X getContent() {
		return content;
	}

	public void setContent(X x) {

		content = x;
		System.out.println("Der Type X ist : " + x.getClass().getName());
	}

	public static void man(String[] args) {
		// Genertics<Integer> gc1=new Genertics<Integer>(32.8, "hi");
		// Genertics<Integer>gc2=new <String>Genertics<Integer>("Test",new Date
		// (2014/6/6));
		// //gc2=setContent( new Integer(42));
		// System.out.println(gc2.getContent());
	}
}

// ausgabe ist:
// Type T ist Double
// Type V ist String
// Type T ist String
// Type V ist Date
// Type X ist Integer
// 42